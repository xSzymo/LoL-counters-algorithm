package xszymo.rest.objects;

public class ChampionInfo {

	private Long id;
	private String name;
	private String key;
	private String title;
	private Info info;

	public ChampionInfo() {

	}


	public ChampionInfo(Long id, String name, String key, String title, Info info) {
		super();
		this.id = id;
		this.name = name;
		this.key = key;
		this.title = title;
		this.info = info;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info stats) {
		this.info = stats;
	}

	public class Info {
		private int attack;
		private int defense;
		private int magic;
		private int difficulty;

		public Info() {

		}

		public Info(int attack, int defense, int magic, int difficulty) {
			this.attack = attack;
			this.defense = defense;
			this.magic = magic;
			this.difficulty = difficulty;
		}

		public int getAttack() {
			return attack;
		}

		public void setAttack(int attack) {
			this.attack = attack;
		}

		public int getMagic() {
			return magic;
		}

		public void setMagic(int magic) {
			this.magic = magic;
		}

		public int getDefense() {
			return defense;
		}

		public void setDefense(int defense) {
			this.defense = defense;
		}

		public int getDifficulty() {
			return difficulty;
		}

		public void setDifficulty(int difficulty) {
			this.difficulty = difficulty;
		}
	}

}
