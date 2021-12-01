package com.Task.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterMultifieldPojo{
	@Inject
	private String title;
	@Inject
	private String image;
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}

}