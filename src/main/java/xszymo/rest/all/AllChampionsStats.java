package xszymo.rest.all;

import java.util.Map;

import xszymo.rest.objects.ChampionStats;

public class AllChampionsStats {
	private String type;
	private String version;
	private Map<String, ChampionStats> data;

	public AllChampionsStats() {

	}

	public AllChampionsStats(String type, String version, Map<String, ChampionStats> data) {
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

	public Map<String, ChampionStats> getData() {
		return data;
	}

	public void setData(Map<String, ChampionStats> data) {
		this.data = data;
	}
}
