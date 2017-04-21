package xszymo.rest.objects.All;

import java.util.Map;

import xszymo.rest.objects.objects.ChampionAllyAdvice;

public class AllAllyChampionsTips {
	private String type;
	private String version;
	private Map<String, ChampionAllyAdvice> data;

	public AllAllyChampionsTips() {

	}

	public AllAllyChampionsTips(String type, String version, Map<String, ChampionAllyAdvice> data) {
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

	public Map<String, ChampionAllyAdvice> getData() {
		return data;
	}

	public void setData(Map<String, ChampionAllyAdvice> data) {
		this.data = data;
	}
}
