package xszymo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xszymo.controllers.others.Algorithm;
import xszymo.controllers.others.WTF;
import xszymo.rest.objects.ChampionInfo;
import xszymo.services.RestApiStatic;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

@Controller
public class Counters {
	@GetMapping("counters")
	public static String counter(@RequestParam("allyChampion1") String allyChampion1,
	                             @RequestParam("allyChampion2") String allyChampion2, @RequestParam("allyChampion3") String allyChampion3,
	                             @RequestParam("allyChampion4") String allyChampion4, @RequestParam("allyChampion5") String allyChampion5,
	                             @RequestParam("enemyChampion1") String enemyChampion1,
	                             @RequestParam("enemyChampion2") String enemyChampion2,
	                             @RequestParam("enemyChampion3") String enemyChampion3,
	                             @RequestParam("enemyChampion4") String enemyChampion4,
	                             @RequestParam("enemyChampion5") String enemyChampion5, HttpServletRequest request, Model model) {

		Collection<ChampionInfo> ally = new LinkedList<>();
		Collection<ChampionInfo> enemy = new LinkedList<>();

		ChampionInfo pickedChampion = RestApiStatic.getOneChampion(request.getParameter("championRadio"));

		ally = RestApiStatic.getAllTeam(allyChampion1, allyChampion2, allyChampion3, allyChampion4, allyChampion5);
		enemy = RestApiStatic.getAllTeam(enemyChampion1, enemyChampion2, enemyChampion3, enemyChampion4, enemyChampion5);

		Collection<ChampionInfo> champions5 = Algorithm.algorithm(ally, enemy, pickedChampion, request.getParameter("line"));
		LinkedList<ChampionInfo> champions = new LinkedList<ChampionInfo>();
		champions.addAll(champions5);

		Collection<ChampionInfo> champions1 = new LinkedList<ChampionInfo>();
		Collection<ChampionInfo> champions2 = new LinkedList<ChampionInfo>();
		Collection<ChampionInfo> champions3 = new LinkedList<ChampionInfo>();
		Collection<ChampionInfo> champions4 = new LinkedList<ChampionInfo>();
		int a = champions.size() / 3;

		for (int i = 0; i < champions.size(); i++)
			if (i < a)
				champions1.add(champions.get(i));
			else if (i < a + a)
				champions2.add(champions.get(i));
			else if (i < a + a + a)
				champions3.add(champions.get(i));
			else
				champions4.add(champions.get(i));


		model.addAttribute("champions1", champions1);
		model.addAttribute("champions2", champions2);
		model.addAttribute("champions3", champions3);
		model.addAttribute("champions4", champions4);
		return "teamCounters";
	}

	@PostMapping("countersForOneChampion")
	public static String counter(@RequestParam("enemyName") String enemyName, HttpServletRequest request, Model model)
			throws IOException {
		model.addAttribute("champions", WTF.getCounters(enemyName));
		model.addAttribute("champion", enemyName);
		model.addAttribute("tips", RestApiStatic.getEnemyTips(enemyName));
		return "oneChampionCounters";
	}
}
