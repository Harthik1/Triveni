package com.Task.Task.core.workflows;

import java.util.HashMap;


import java.util.Map;

import javax.jcr.Session;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import com.day.cq.replication.ReplicationActionType;
import com.day.cq.replication.ReplicationException;
import com.day.cq.replication.Replicator;


@Component(immediate = true, enabled = true, service = WorkflowProcess.class, property = {
		Constants.SERVICE_DESCRIPTION + "=After Upload an Asste gust Publish it",
		"process.label=" + "Custome Publish Workflow", "propertyPrivate=" + "true" })
public class PublishAssetsWorkflow implements WorkflowProcess {
	private static final Logger LOG = LoggerFactory.getLogger(PublishAssetsWorkflow.class);

	@Reference
	private Replicator replicator;
	@Reference
	private ResourceResolverFactory resourceResolverFactory;

	@Override
	public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) {
		ResourceResolver resolver = null;
		Session session = null;
		try {
			Map<String, Object> param = new HashMap<>();
			param.put(ResourceResolverFactory.SUBSERVICE, WorkflowConstants.SUB_SERVICE_USER);
			resolver = resourceResolverFactory.getServiceResourceResolver(param);
			session = resolver.adaptTo(Session.class);
			WorkflowData workflowData = workItem.getWorkflowData();
			String payloadPath = workflowData.getPayload().toString();
			replicator.replicate(session, ReplicationActionType.ACTIVATE, payloadPath);
			LOG.info("Replicated: {}", payloadPath);
		}
			catch (ReplicationException |LoginException | IllegalStateException e) {
			LOG.error( WorkflowConstants.ERROR_LOG_MESSAGE, e);
		
			}
		finally {
			if (session != null && session.isLive()) {
				session.logout();
			}
			if (resolver != null) {
				resolver.close();
			}
		}
	}	
}