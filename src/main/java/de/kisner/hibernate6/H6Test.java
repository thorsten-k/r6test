package de.kisner.hibernate6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class H6Test
{
	final static Logger logger = LoggerFactory.getLogger(H6Test.class);
	
	public H6Test()
	{
		
	}
	
	public void init()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h6");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	}
	
	public static void main(String[] args)
	{

		logger.info("trace");

	}
}