package com.mini.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
	@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	public class FooterPojo{
		@Inject
		private String title;
		@Inject
		private String href;
		@Inject
		private String image;
		@Inject
		private String text;
		public String getTitle() {
			return title;
		}
		public String getHref() {
			return href;
		}
		public String getImage() {
			return image;
		}
		public String getText() {
			return text;
		}
		
	}
