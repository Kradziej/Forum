package forum;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Stateless
@Local(ManagePostsDAO.class)
public class ManagePostsImpl implements ManagePostsDAO {

	@PersistenceContext
	private EntityManager em;
	
	ManagePostsImpl() {}
	
	@Override
	public void createPost(PostEntity post, Integer threadId) {
		
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
	public void test(ThreadEntity th) {

		em.persist(th);
		em.flush();
		
	}

	@Override
	public void test2() {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ThreadEntity> cq = cb.createQuery(ThreadEntity.class);
		Root<ThreadEntity> threads = cq.from(ThreadEntity.class);
		cq.select(threads);
		TypedQuery<ThreadEntity> q = em.createQuery(cq);
		List<ThreadEntity> allThreads = q.getResultList();
		
		for(ThreadEntity t : allThreads) {
			
			System.out.println(t.getOrder());
		}
		
	}

	
	// GETTERS SETTERS
	


}
