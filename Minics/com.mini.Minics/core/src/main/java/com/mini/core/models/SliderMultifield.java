package com.mini.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SliderMultifield {
	@Inject
	private List<SliderPojo> slides ;

	public List<SliderPojo> getSlides() {
		return slides;
	}
}
