package com.Task.core.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, property = { "sling.servlet.methods=" + HttpConstants.METHOD_POST,
		"sling.servlet.paths=" + "/Task/tri", "sling.servlet.extensions=" + "json" })

@ServiceDescription("CreateJdbcData Servlet")

public class InsertJdbcData extends SlingAllMethodsServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = LoggerFactory.getLogger(CreateJdbcData.class);
	@Reference
	private DatabaseConnection getdata;
	private Connection conne;

	@Override
	protected void doPost(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
			throws ServletException, IOException {
		try {

			conne = getdata.getConnection("sample");
			LOG.info(conne.toString());
			Statement st = conne.createStatement();

			st.executeUpdate("insert into emp values('1615','Triveni','22')");
			st.executeUpdate("insert into emp values('1616','Neetha','22')");
			resp.getWriter().print("Inserted data Successfully");

		} catch (Exception e) {
			LOG.error(e.getMessage());

		}
	}
}
