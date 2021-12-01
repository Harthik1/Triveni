package com.mini.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderMultifield{
@Inject
private List<HeaderPojo> apps ;

public List<HeaderPojo> getApps() {
	return apps;
}
@Inject
private List<HeaderPojo> field;

public List<HeaderPojo> getField() {
	return field;
}
@Inject
private List<HeaderPojo> icon;

public List<HeaderPojo> getIcon() {
	return icon;
}
}