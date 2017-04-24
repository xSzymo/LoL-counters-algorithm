package xszymo.controllers.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

import xszymo.configuration.SystemVariables;
import xszymo.rest.objects.ChampionInfo;
import xszymo.services.RestApiStatic;

public class WTF {

	public static String[] getCounters(String name) {
		String[] counters = getCountersChampionsNames(name, file());
		return counters;
	}

	public static String file() {
		String everything = "";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(SystemVariables.PATH));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return everything;
	}

	public static String[] getCountersChampionsNames(String name, String text) {
		char[] newTextArray = getCountersTextForSpecificChampion(name, text);
		String[] names = new String[6];
		String newText = "";
		int index = 0;
		Collection<ChampionInfo> champions = RestApiStatic.getAllChampions();

		for (int i = 0; i < newTextArray.length; i++)
			newText += newTextArray[i];

		for (ChampionInfo x : champions) 
			if (newText.contains(x.getName()) && !x.getName().equals(name) && index < 5) 
				names[index++] = x.getName();
		return names;
	}

	public static char[] getCountersTextForSpecificChampion(String nameWithStrong, String everything) {
		nameWithStrong += "</strong>";
		String column = "<td class=\"column-7\">";

		char[] weirdoNameoArrayo;
		char[] text = everything.toCharArray();
		char[] championName = nameWithStrong.toCharArray();
		char[] textToReturn = null;

		int championIndex = 0;
		int columnIndex;
		int indexTextStartAt = 0;
		int indexTextEndAt = 0;

		int CHAMPION_INDEX = 10;// 14 before

		for (int i = 0; i < text.length; i++) {
			if (text[i] == championName[championIndex]) {
				if (championIndex == CHAMPION_INDEX) {
					indexTextStartAt = i - championIndex;
					columnIndex = 0;
					weirdoNameoArrayo = column.toCharArray();
					while (true) {
						i++;
						if (text[i] == weirdoNameoArrayo[columnIndex]) {
							if (columnIndex == 20) {
								indexTextEndAt = i - columnIndex + 32;
								textToReturn = new char[indexTextEndAt - indexTextStartAt];
								for (int r = 0; indexTextStartAt < indexTextEndAt; indexTextStartAt++, r++)
									textToReturn[r] = text[indexTextStartAt];
								return textToReturn;
							}
							columnIndex++;
							continue;
						}
						columnIndex = 0;
					}
				}
				championIndex++;
				continue;
			}
			championIndex = 0;
		}
		return null;
	}
}
