package com.Task.core.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.PropertyIterator;
import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Task.Task.core.workflows.WorkflowConstants;

@Component(service = Servlet.class, property = { "sling.servlet.methods=" + HttpConstants.METHOD_GET,
		"sling.servlet.paths=" + "/Task/GetNodeProperties", "sling.servlet.extensions=" + "json" })

public class GetServlet extends SlingSafeMethodsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Logger LOG = LoggerFactory.getLogger(CrudServlet.class);

	@Reference
	private ResourceResolverFactory resolverFactory;
	ResourceResolver resolver;

	@Override
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
throws ServletException, IOException {

		String newnodename = req.getParameter("name");

		try {

			Map<String, Object> param = new HashMap<>();
			param.put(ResourceResolverFactory.SUBSERVICE, WorkflowConstants.SUB_SERVICE_USER);
			resolver = resolverFactory.getServiceResourceResolver(param);

			JSONObject response = new JSONObject();

			resp.setContentType("application/json");
			Session session = resolver.adaptTo(Session.class);

			Resource resource = resolver.getResource("/content/Task/us/triveni/"+newnodename);

			Node page = resource.adaptTo(Node.class);
			PropertyIterator propIter = page.getProperties();
			while (propIter.hasNext()) {

				Property p = (Property) propIter.next();

				response.put(p.getName(), p.getValue());
			}
			resp.getWriter().print(response);
			session.save();
			session.logout();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}