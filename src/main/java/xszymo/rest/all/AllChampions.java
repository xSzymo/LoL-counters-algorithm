package xszymo.rest.all;

import xszymo.rest.objects.ChampionInfo;

import java.util.Map;

public class AllChampions {
	private String type;
	private String version;
	private Map<String, ChampionInfo> data;

	public AllChampions() {

	}

	public AllChampions(String type, String version, Map<String, ChampionInfo> data) {
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

	public Map<String, ChampionInfo> getData() {
		return data;
	}

	public void setData(Map<String, ChampionInfo> data) {
		this.data = data;
	}
}
