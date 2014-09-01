package forum;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;


@Stateless
public class ManagePostsImpl implements ManagePostsDAO {

	@PersistenceUnit( unitName="forumManagement" )
	private EntityManagerFactory emf;
	
	ManagePostsImpl() {}
	
	@Override
	public void createPost(Post post, Integer threadId) {
		
		EntityManager em = emf.createEntityManager();
		em.persist(post);
		em.flush();
		
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editPost(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeTopic(String topic) {
		// TODO Auto-generated method stub
		
	}

	
	// GETTERS SETTERS

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	

}
