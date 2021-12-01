package com.mini.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FoooterMutltifield {
@Inject
private List<FooterPojo> footer ;

public List<FooterPojo> getFooter() {
	return footer;
}
@Inject
private List<FooterPojo> links ;

public List<FooterPojo> getLinks() {
	return links;
}
@Inject
private List<FooterPojo> icon ;

public List<FooterPojo> getIcon() {
	return icon;
}


}
