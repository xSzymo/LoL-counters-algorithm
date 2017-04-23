package xszymo.services;

import java.util.Collection;
import java.util.LinkedList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import xszymo.rest.all.AllChampions;
import xszymo.rest.objects.ChampionEnemyAdvice;
import xszymo.rest.objects.ChampionInfo;

@RestController
public class RestApiStatic {

	public static final String key = "RGAPI-0a1ea673-7a95-4309-8c5b-1aa42a6aee51";

	public static ChampionInfo getOneChampion(String name) {
		RestApi rest = new RestApi();
		RestTemplate restTemplate = new RestTemplate();
		rest.operations = restTemplate;

		Collection<ChampionInfo> champions = rest.getChampionInfo();
		ChampionInfo champion = null;
		for (ChampionInfo x : champions)
			if (x.getName().equals(name))
				champion = x;

		if (champion == null)
			return null;
		return champion;
	}

	public static String[] getEnemyTips(String name) {
		RestApi rest = new RestApi();
		RestTemplate restTemplate = new RestTemplate();
		rest.operations = restTemplate;

		Collection<ChampionEnemyAdvice> champions = rest.getEnemyChampionsTips();
		for (ChampionEnemyAdvice x : champions)
			if (x.getName().equals(name))
				return x.enemytips;
		return null;
	}

	public static Collection<ChampionInfo> getAllTeam(String... names) {
		Collection<ChampionInfo> team = new LinkedList<>();
		int j = 0;
		RestApi rest = new RestApi();
		RestTemplate restTemplate = new RestTemplate();
		rest.operations = restTemplate;

		Collection<ChampionInfo> champions = rest.getChampionInfo();
		for (int i = 5; i > j; j++) {
			for (ChampionInfo x : champions)
				if (x.getName().equals(names[j]))
					team.add(x);
		}
		return team;
	}

	public static Collection<ChampionInfo> getAllChampions() {
		RestApi rest = new RestApi();
		RestTemplate restTemplate = new RestTemplate();
		rest.operations = restTemplate;
		String url = "https://global.api.riotgames.com/api/lol/static-data/EUW/v1.2/champion?champData=info&api_key="
				+ key;
		AllChampions api = rest.operations.getForObject(url, AllChampions.class);
		Collection<ChampionInfo> champions = api.getData().values();
		return champions;
	}
}
