package de.kisner.h6test;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jeesl.api.facade.system.JeeslExportRestFacade;
import org.jeesl.api.rest.rs.jk.io.db.JeeslIoDbRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;

public class R6Test
{
	final static Logger logger = LoggerFactory.getLogger(R6Test.class);
	
	public R6Test()
	{
		
	}
	
	public static void main(String[] args)
	{
		R6Test test = new R6Test();
		
		Client client = ClientBuilder.newClient();
		ResteasyWebTarget target = (ResteasyWebTarget)client.target(JeeslExportRestFacade.urlJeesl);
		JeeslIoDbRest rest = target.proxy(JeeslIoDbRest.class);
	}
}