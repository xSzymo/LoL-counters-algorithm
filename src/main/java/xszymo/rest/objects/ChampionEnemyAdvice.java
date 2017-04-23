	package xszymo.rest.objects;

	public class ChampionEnemyAdvice {

		private Long id;
		private String name;
		private String key;
		private String title;
		public String[] enemytips;


		public ChampionEnemyAdvice() {

		}

		public ChampionEnemyAdvice(Long id, String name, String key, String title, String[] enemytips) {
			super();
			this.id = id;
			this.name = name;
			this.key = key;
			this.title = title;
			this.enemytips = enemytips;
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

	}