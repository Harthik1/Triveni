package com.mini.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ValuemapValue {
	@ValueMapValue 
	String title;
	@ValueMapValue 
	String description;
	@ValueMapValue 
	String name;
public String getTitle() {
	return title;
}
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
}
}
