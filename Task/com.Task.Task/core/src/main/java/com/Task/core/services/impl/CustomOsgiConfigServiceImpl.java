package com.Task.core.services.impl;

	import org.osgi.framework.Constants;
	import org.osgi.service.component.annotations.Activate;
	import org.osgi.service.component.annotations.Component;
	import org.osgi.service.metatype.annotations.Designate;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;

import com.Task.Task.core.osgi.OsgiConfig;
import com.Task.core.services.CustomOsgiConfigService;

	@Component(
	        service = CustomOsgiConfigService.class,
	        immediate = true,
	        property = {
	                Constants.SERVICE_ID + "=Card Service",
	                Constants.SERVICE_DESCRIPTION + "=This service reads values from Card Configuration"
	        })
	@Designate(ocd = OsgiConfig.class)
	public class CustomOsgiConfigServiceImpl implements CustomOsgiConfigService {

}
