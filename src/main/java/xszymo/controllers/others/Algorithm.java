package xszymo.controllers.others;

import java.util.Collection;

import xszymo.rest.objects.ChampionInfo;
import xszymo.services.RestApiStatic;

public class Algorithm {
	public static final String SUPP = "support";
	public static final String ADC = "adc";
	public static final String MID = "mid";
	public static final String TOP = "top";
	public static final String JUNGLE = "jungle";
	
	public static Collection<ChampionInfo> algorithm(Collection<ChampionInfo> ally, Collection<ChampionInfo> enemy, ChampionInfo you, String line) {
		Collection<ChampionInfo> allChampions = RestApiStatic.getAllChampions();
		
		return Other.getCountersForChampionWithOutLine(allChampions, ally, enemy, you, line);		
	}
}
