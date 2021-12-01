package com.Task.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Contact{
	@Inject
	private String title;
	@Inject
	private String image;
	@Inject
	private String dolartext;
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	public String getDolartext() {
		return dolartext;
	}
}
