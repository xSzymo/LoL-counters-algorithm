package xszymo.controllers.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import xszymo.rest.objects.ChampionInfo;

public class Other2 {
	public static Collection<ChampionInfo> sortChampions(Collection<ChampionInfo> allChampions, String nameOfLine) {
		Collection<ChampionInfo> champions = new LinkedList<ChampionInfo>();
		try (BufferedReader br = new BufferedReader(new FileReader("E:/123/LINEINFO.txt"))) {
			String line;
				while ((line = br.readLine()) != null)
					for (ChampionInfo x : allChampions)
						if (line.contains(x.getName()))
							if (!line.contains("Supp"))
								champions.add(x);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return champions;
	}

}
