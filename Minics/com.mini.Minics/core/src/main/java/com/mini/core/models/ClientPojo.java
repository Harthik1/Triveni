package com.mini.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ClientPojo {
	@Inject
	private String description;
	@Inject
	private String text1;
	@Inject
	private String image;
	@Inject
	private String text2;

	public String getText1() {
		return text1;
	}

	public String getText2() {
		return text2;
	}

	

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

}
