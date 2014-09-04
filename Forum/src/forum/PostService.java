package forum;

import java.util.Date;
import javax.ejb.Singleton;

@Singleton
public class PostService {
	
	private Date newCPostTIme;
	private Date newThreadTime;
	private boolean isNewContribution;
	
	
	public boolean isNewContribution() {
		
		return isNewContribution;
	}

}
