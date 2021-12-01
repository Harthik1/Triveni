package com.mini.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProductPojo {
	@Inject
	private String title;
	@Inject
	private String middle;
	@Inject
	private String price;
	@Inject
	private String image;
	@Inject
	private String href;
	public String getHref() {
		return href;
	}

	public String getTitle() {
		return title;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public String getPrice() {
		return price;
	}
	
	public String getImage() {
		return image;
	}
	

}
