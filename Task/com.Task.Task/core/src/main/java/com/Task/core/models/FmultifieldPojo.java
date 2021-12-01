package com.Task.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class  FmultifieldPojo{
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
	@Inject
	private List<NestedMultifieldPojo> app ;

	public List<NestedMultifieldPojo> getApp() {
		return app;
	}


}

