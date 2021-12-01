package com.Task.core.models;


import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldPojo{
	@Inject
	private String title;
	@Inject
	private String href;
	@Inject
	private String imageurl;
	public String getTitle() {
		return title;
	}
	public String getHref() {
		return href;
	}
	public String getImageurl() {
		return imageurl;
	}
	
}
