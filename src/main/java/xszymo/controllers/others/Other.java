package xszymo.controllers.others;

import xszymo.configuration.SystemVariables;
import xszymo.rest.objects.ChampionInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

public class Other {
	public static Collection<ChampionInfo> getCountersForChampionWithOutLine(Collection<ChampionInfo> allChampions,
	                                                                         Collection<ChampionInfo> ally, Collection<ChampionInfo> enemy, ChampionInfo you, String line) {
		Collection<ChampionInfo> championsToReturn = new LinkedList<ChampionInfo>();
		Collection<ChampionInfo> enemyChampions = new LinkedList<ChampionInfo>();
		allChampions = getChampionsForSpecificLine(allChampions, line);
		enemyChampions = getChampionsForSpecificLine(enemy, line);
		championsToReturn.addAll(allChampions);

		for (ChampionInfo acutallyChampion : allChampions) {
			if (acutallyChampion.getName().equals("Rakan") || acutallyChampion.getName().equals("Xayah"))
				continue;
			String[] countersForActuallyChampion = WTF.getCounters(acutallyChampion.getName());

			if (enemyChampions.size() > 0)
				for (ChampionInfo x2 : enemyChampions)
					if (countersForActuallyChampion.length > 0)
						for (String x1 : countersForActuallyChampion)
							if (x2 != null && x1 != null)
								if (x2.getName().equals(x1))
									if (championsToReturn.contains(acutallyChampion))
										championsToReturn.remove(acutallyChampion);
		}

		return championsToReturn;
	}

	public static Collection<ChampionInfo> getChampionsForSpecificLine(Collection<ChampionInfo> allChampions,
	                                                                   String nameOfLine) {
		Collection<ChampionInfo> champions = new LinkedList<ChampionInfo>();
		try (BufferedReader br = new BufferedReader(new FileReader(SystemVariables.PATH_LINE_INFO))) {
			String line;
			while ((line = br.readLine()) != null)
				for (ChampionInfo x : allChampions)
					if (line.contains(x.getName()))
						if (line.contains(nameOfLine))
							champions.add(x);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return champions;
	}
}
