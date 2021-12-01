package com.mini.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SliderPojo {
	@Inject
	private String title;
	@Inject
	private String description;
	@Inject
	private String image;
	@Inject
	private String text;
	@Inject
	private String href;


	public String getHref() {
		return href;
		}

	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getImage() {
		return image;
	}
	
	public String getText() {
		return text;
	}
}
	
