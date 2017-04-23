package xszymo.rest.all;

import java.util.Map;

import xszymo.rest.objects.ChampionTags;

public class AllTagsChampions {
	private String type;
	private String version;
	private Map<String, ChampionTags> data;

	public AllTagsChampions() {

	}

	public AllTagsChampions(String type, String version, Map<String, ChampionTags> data) {
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

	public Map<String, ChampionTags> getData() {
		return data;
	}

	public void setData(Map<String, ChampionTags> data) {
		this.data = data;
	}
}
