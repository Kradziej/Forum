package forum;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class Resources {

	
	@PersistenceContext
	@Produces
	private EntityManager em; 
	
	
	@Produces
	public EntityManager getEntityManager() {
		
		return em;
	}
}
