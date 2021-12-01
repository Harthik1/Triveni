package com.Task.core.servlets;

import java.sql.Connection;


import javax.servlet.Servlet;
import javax.sql.DataSource;

import org.apache.sling.api.servlets.HttpConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.commons.datasource.poolservice.DataSourcePool;

@Component(service=DatabaseConnection.class, immediate=true)
public class DatabaseConnection {
	private static final Logger LOG = LoggerFactory.getLogger(DatabaseConnection.class);
	@Reference
	DataSourcePool source;
	public Connection getConnection(String datasourceName) {
		DataSource datasource=null;
		Connection con=null;
		try {
			LOG.debug("Inside Connection, source is {}", source);
			datasource=(DataSource)source.getDataSource(datasourceName);
			con=datasource.getConnection();
			return con;
		}
		catch(Exception e) {
			LOG.error("Error occured while establishing the connection: : : {}", e);
		}
		return null;
	}
}
