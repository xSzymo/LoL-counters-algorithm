package xszymo.rest.all;

import java.util.Map;

import xszymo.rest.objects.ChampionEnemyAdvice;

public class AllEnemyChampionsTips {
	private String type;
	private String version;
	private Map<String, ChampionEnemyAdvice> data;

	public AllEnemyChampionsTips() {

	}

	public AllEnemyChampionsTips(String type, String version, Map<String, ChampionEnemyAdvice> data) {
		this.type = type;
		this.version = version;
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Map<String, ChampionEnemyAdvice> getData() {
		return data;
	}

	public void setData(Map<String, ChampionEnemyAdvice> data) {
		this.data = data;
	}
}
