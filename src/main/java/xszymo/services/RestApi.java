package xszymo.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

import xszymo.rest.all.AllAllyChampionsTips;
import xszymo.rest.all.AllChampions;
import xszymo.rest.all.AllChampionsStats;
import xszymo.rest.all.AllEnemyChampionsTips;
import xszymo.rest.all.AllTagsChampions;
import xszymo.rest.objects.ChampionAllyAdvice;
import xszymo.rest.objects.ChampionEnemyAdvice;
import xszymo.rest.objects.ChampionInfo;
import xszymo.rest.objects.ChampionStats;
import xszymo.rest.objects.ChampionTags;

@RestController
public class RestApi {

	public static final String key = "";

	@Autowired
	public RestOperations operations;

	@RequestMapping("getChampion/{name}")
	public ChampionInfo getChampion(@PathVariable("name") String name) {
		Collection<ChampionInfo> champions = getChampionInfo();
		ChampionInfo champion = null;
		for (ChampionInfo x : champions)
			if (x.getName().equals(name))
				champion = x;

		if (champion == null)
			return null;
		return champion;
	}

	@RequestMapping("getChampionsInfo")
	public Collection<ChampionInfo> getChampionInfo() {
		String url = "https://global.api.riotgames.com/api/lol/static-data/EUW/v1.2/champion?champData=info&api_key="
				+ key;
		AllChampions api = operations.getForObject(url, AllChampions.class);
		Collection<ChampionInfo> champions = api.getData().values();
		return champions;
	}

	@RequestMapping("getChampionsStats")
	public Collection<ChampionStats> getChampionsStats() {
		String url = "https://global.api.riotgames.com/api/lol/static-data/EUW/v1.2/champion?champData=stats&api_key="
				+ key;
		AllChampionsStats api = operations.getForObject(url, AllChampionsStats.class);
		Collection<ChampionStats> champions = api.getData().values();
		return champions;
	}

	@RequestMapping("getEnemyChampionsTips")
	public Collection<ChampionEnemyAdvice> getEnemyChampionsTips() {
		String url = "https://euw1.api.riotgames.com/lol/static-data/v3/champions?champData=enemytips&api_key=" + key;
		AllEnemyChampionsTips api = operations.getForObject(url, AllEnemyChampionsTips.class);
		Collection<ChampionEnemyAdvice> champions = api.getData().values();
		return champions;
	}

	@RequestMapping("getAllyChampionsTips")
	public Collection<ChampionAllyAdvice> getAllyChampionsTips() {
		String url = "https://euw1.api.riotgames.com/lol/static-data/v3/champions?champData=allytips&api_key=" + key;
		AllAllyChampionsTips api = operations.getForObject(url, AllAllyChampionsTips.class);
		Collection<ChampionAllyAdvice> champions = api.getData().values();
		return champions;
	}

	@RequestMapping("yolo1")
	public void halo() throws IOException {
		String text = "";
		try (BufferedReader br = new BufferedReader(new FileReader("E:/123/1234.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains("Champion : "))
					text += line.substring(10, line.length());

				if (line.contains("line : "))
					text += line.substring(6, line.length()) + "\n";
			}
		}

		try {
			PrintWriter pr = new PrintWriter("E:/123/lines.txt");
			int i = 0;
				pr.println(text);
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No such file exists.");
		}

	}

	@RequestMapping("yolo")
	public void getChampions123Tips() {
		String url = "https://euw1.api.riotgames.com/lol/static-data/v3/champions?champData=tags&api_key=" + key;
		AllTagsChampions api = operations.getForObject(url, AllTagsChampions.class);
		Collection<ChampionTags> champions = api.getData().values();

		Collection<ChampionEnemyAdvice> a = getEnemyChampionsTips();
		Collection<ChampionAllyAdvice> a1 = getAllyChampionsTips();
		Collection<ChampionInfo> b = getChampionInfo();
		Collection<ChampionStats> c = getChampionsStats();
		int j = 0;
		LinkedList<Long> list = new LinkedList<Long>();

		for (ChampionStats x : c)
			list.add(x.getId());

		String[] yolo = new String[150];
		int i = -1;
		for (Long bam : list) {
			for (ChampionTags x : champions) {
				if (!bam.equals(x.getId()))
					continue;
				for (ChampionStats x1 : c) {
					if (!bam.equals(x1.getId()))
						continue;
					for (ChampionInfo x2 : b) {
						if (!bam.equals(x2.getId()))
							continue;
						for (ChampionAllyAdvice x3 : a1) {
							if (!bam.equals(x3.getId()))
								continue;
							for (ChampionEnemyAdvice x4 : a) {
								if (bam.equals(x.getId()) && bam.equals(x1.getId()) && bam.equals(x2.getId())
										&& bam.equals(x3.getId()) && bam.equals(x4.getId())) {

									i++;
									yolo[i] = "";
									yolo[i] += "Champion : " + x.getName() + "\n\t";
									yolo[i] += "id : " + x.getId() + "\n\t";
									yolo[i] += "title : " + x.getTitle() + "\n\t";
									yolo[i] += "tags : ";
									for (String e : x.getTags())
										yolo[i] += e + ", ";

									yolo[i] += "\n\tline : ";
									for (String e : x.getTags()) {
										if (e.equals("Marksman")) {
											yolo[i] += "Adc" + ", ";
											break;
										}
										if (e.equals("Support"))
											yolo[i] += "Supp" + ", ";
										if (e.equals("Mage"))
											yolo[i] += "Mid" + ", ";
										if (e.equals("Fighter"))
											yolo[i] += "Top" + ", ";
										if (e.equals("Assassin"))
											yolo[i] += "Mid" + ", ";
										if (e.equals("Tank"))
											yolo[i] += "Top" + ", ";
									}

									yolo[i] += "\n";
									yolo[i] += "\n";

									yolo[i] += "\tatack : " + x2.getInfo().getAttack() + "\n\t";
									yolo[i] += "defense : " + x2.getInfo().getDefense() + "\n\t";
									yolo[i] += "magic : " + x2.getInfo().getMagic() + "\n\t";
									yolo[i] += "difficulty : " + x2.getInfo().getDifficulty() + "\n";

									yolo[i] += "\n";

									yolo[i] += "Stats :\n\t";
									yolo[i] += "armor :" + x1.getStats().getArmor() + "\n\t";
									yolo[i] += "armor per lv :" + x1.getStats().getArmorperlevel() + "\n\t";
									yolo[i] += "atack dmg:" + x1.getStats().getAttackdamage() + "\n\t";
									yolo[i] += "atack dmg per lv :" + x1.getStats().getAttackdamageperlevel() + "\n\t";
									yolo[i] += "atack range :" + x1.getStats().getAttackrange() + "\n\t";
									yolo[i] += "atack speed :" + x1.getStats().getAttackspeedoffset() + "\n\t";
									yolo[i] += "atack speed per lv :" + x1.getStats().getAttackspeedperlevel() + "\n\t";
									yolo[i] += "crit :" + x1.getStats().getCrit() + "\n\t";
									yolo[i] += "crit per lv :" + x1.getStats().getCritperlevel() + "\n\t";
									yolo[i] += "hp :" + x1.getStats().getHp() + "\n\t";
									yolo[i] += "hp per lv :" + x1.getStats().getHpperlevel() + "\n\t";
									yolo[i] += "hp regen :" + x1.getStats().getHpregen() + "\n\t";
									yolo[i] += "hp regener per lv :" + x1.getStats().getHpregenperlevel() + "\n\t";
									yolo[i] += "mv speed :" + x1.getStats().getMovespeed() + "\n\t";
									yolo[i] += "spell block :" + x1.getStats().getSpellblock() + "\n\t";
									yolo[i] += "spell block per lv :" + x1.getStats().getSpellblockperlevel() + "\n";

									yolo[i] += "\n";

									yolo[i] += "Ally tips :\n\t";
									for (String x5 : x3.allytips)
										yolo[i] += x5 + ", ";
									yolo[i] += "\n";

									yolo[i] += "Enemy tips :\n\t";
									for (String x5 : x4.enemytips)
										yolo[i] += x5 + ", ";

									yolo[i] += "\n\n\n";
								}
							}
						}
					}
				}
			}

		}
		System.out.println(i);
		System.out.println(list.size());
		try

		{
			PrintWriter pr = new PrintWriter("E:/123/1234.txt");

			for (i = 0; i < yolo.length; i++) {
				pr.println(yolo[i]);
			}
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No such file exists.");
		}
	}
}
