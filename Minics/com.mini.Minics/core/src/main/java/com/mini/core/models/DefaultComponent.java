package com.mini.core.models;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DefaultComponent {

	@Inject @Default(values="AEM")
	
	String title;
	@Inject @Default(values="This is a Component")
	String description;
	@Inject @Default(values="Triveni")
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