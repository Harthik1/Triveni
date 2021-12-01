package com.Task.core.models;


import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, adapters = Dialog.class)

public class Dialog {
	public class UserModel {
		@Inject
		private String logo;
		@Inject
		private String href;
		@Inject
		private String nav1Title;
		@Inject
		private String nav1Href;
		@Inject
		private String nav2Title;
		@Inject
		private String nav2Href;
		@Inject
		private String nav3Title;
		@Inject
		private String nav3Href;
		@Inject
		private String nav4Title;
		@Inject
		private String nav4Href;
		@Inject
		private String nav5Title;
		@Inject
		private String nav5Href;

		public String getlLogo() {
			return logo;
		}

		public String getHref() {
			return href;
		}

		public String getNav1title() {
			return nav1Title;
		}

		public String getNav1href() {
			return nav1Href;
		}

		public String getNav2title() {
			return nav2Title;
		}

		public String getNav2href() {
			return nav2Href;
		}

		public String getNav3title() {
			return nav3Title;
		}

		public String getNav3href() {
			return nav3Href;
		}

		public String getNav4title() {
			return nav4Title;
		}

		public String getNav4href() {
			return nav4Href;
		}

		public String getNav5title() {
			return nav5Title;
		}

		public String getNav5href() {
			return nav5Href;
		}

	}
}
