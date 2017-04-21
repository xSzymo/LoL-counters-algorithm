	package xszymo.rest.objects.objects;

	public class ChampionTags {

		private Long id;
		private String name;
		private String key;
		private String title;
		private String[] tags;


		public ChampionTags() {

		}

		public ChampionTags(Long id, String name, String key, String title, String[] enemytips) {
			super();
			this.id = id;
			this.name = name;
			this.key = key;
			this.title = title;
			this.setTags(enemytips);
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

		public String[] getTags() {
			return tags;
		}

		public void setTags(String[] tags) {
			this.tags = tags;
		}

	}