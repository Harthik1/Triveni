package com.Task.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
	@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	public class FooterMultifield {
		@Inject
		private List<Contact> contact ;

		public List<Contact> getContact() {
			return contact;
	}
		@Inject
		private List<Contact> texts ;

		public List<Contact> getTexts() {
			return texts;
	}
		@Inject
		private String logo;
		public String getLogo() {
			return logo;
		}
		@Inject
		private String text;
	
		@Inject
		private String textarea;
		public String getText() {
			return text;
		}
		
		public String getTextarea() {
			return textarea;
		}
	}

