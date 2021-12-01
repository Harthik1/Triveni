package com.Task.core.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, property = { "sling.servlet.methods=" + HttpConstants.METHOD_GET,
		"sling.servlet.paths=" + "/Task/t", "sling.servlet.extensions=" + "json" })
@ServiceDescription("GetJdbcData Servlet")
public class GetJdbcData extends SlingSafeMethodsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = LoggerFactory.getLogger(GetJdbcData.class);
	@Reference
	private DatabaseConnection getdata;
	
	private Connection conne;
	@Override
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
throws ServletException, IOException {
		try {
			
			conne=getdata.getConnection("sample");
			LOG.info(conne.toString());
			Statement st=conne.createStatement();
	
			ResultSet rs=st.executeQuery("select id,name,age from emp");
		
			String value=null;
			while(rs.next()){
				value=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+"\n";
				resp.getWriter().print(value);
				}
		}
		catch(Exception e) {
			LOG.error(e.getMessage());
		}
	}
}
