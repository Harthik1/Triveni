package com.mini.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WhyusMultifield {
	@Inject
	private List<SliderPojo> whyus ;

	public List<SliderPojo> getWhyus() {
		return whyus;
	}
}
