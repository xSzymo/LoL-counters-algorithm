package xszymo.controllers;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xszymo.controllers.others.Algorithm;
import xszymo.controllers.others.WTF;
import xszymo.rest.objects.ChampionInfo;
import xszymo.services.RestApiStatic;

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
			@RequestParam("enemyChampion5") String enemyChampion5, HttpServletRequest request) {

		Collection<ChampionInfo> ally = new LinkedList<>();
		Collection<ChampionInfo> enemy = new LinkedList<>();

		if (request.getParameter("championRadio") == null)
			return "teamCounters";

		ChampionInfo pickedChampion = RestApiStatic.getOneChampion(request.getParameter("championRadio"));

		if (pickedChampion == null)
			return "teamCounters";

		ally = RestApiStatic.getAllTeam(allyChampion1, allyChampion2, allyChampion3, allyChampion4, allyChampion5);
		enemy = RestApiStatic.getAllTeam(enemyChampion1, enemyChampion2, enemyChampion3, enemyChampion4, enemyChampion5);

		System.out.println(
				"Champions : " + Algorithm.algorithm(ally, enemy, pickedChampion, request.getParameter("line")));

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
