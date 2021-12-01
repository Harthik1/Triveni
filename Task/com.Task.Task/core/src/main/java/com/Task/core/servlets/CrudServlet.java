package com.Task.core.servlets;

import com.Task.Task.core.workflows.WorkflowConstants;
import com.google.gson.JsonObject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Node;
import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;

@Component(service = Servlet.class, property = { "sling.servlet.methods=" + HttpConstants.METHOD_POST,
		"sling.servlet.paths=" + "/Task/triveni", "sling.servlet.extensions=" + "json" })
@ServiceDescription("Crud Servlet")

public class CrudServlet extends SlingAllMethodsServlet {

	private static final Logger LOG = LoggerFactory.getLogger(CrudServlet.class);

	@Reference
	private ResourceResolverFactory resolverFactory;
	ResourceResolver resolver;

	@Override
	protected void doPost(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
			throws ServletException, IOException {

		String newnodename = req.getParameter("name");

		try {

			Map<String, Object> param = new HashMap<>();
			param.put(ResourceResolverFactory.SUBSERVICE, WorkflowConstants.SUB_SERVICE_USER);                                                              
			resolver = resolverFactory.getServiceResourceResolver(param);

			JsonObject obj = new JsonObject();

			resp.setContentType("application/json");
			Session session = resolver.adaptTo(Session.class);

			Resource resource = resolver.getResource("/content/Task/us/");

			if (resource != null) {

				Node page = resource.adaptTo(Node.class);
				Node newNode = page.addNode(newnodename, "cq:Page");
				Node node=newNode.addNode("jcr:content", "cq:PageContent");
				node.setProperty("jcr:title", "ServletPage");
				node.setProperty("cq:template","/conf/Task/settings/wcm/templates/adsitertemplate");
				node.setProperty("sling:resourceType", "Task/components/structure/adsiterpage1");
				resp.getWriter().write("Node created Successfully"+newnodename);
				session.save();
			} else {

				resp.getWriter().write("Node  created Unsuccessfully");

			}
			session.logout();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}