package forum;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped 
public class AnonymousPoster implements Post {
	
	private Integer parentPostId;
	private Integer postId; //????? don't know yeeeeeeeeeeeet xD
	private String posterName;
	private String message;
	private String[] imageName;
	private String[] imageId;
	private String topic;
	
	//Settings somewhere (EJB with setting values form xml)
	private String anon = "Anonymous";
	
	@EJB private ManageDAO manage;
	
	
	@Override
	public void createPost() {
		
		PostEntity post = new PostEntity();
		
		if(posterName == null)
			post.setPosterName(anon);
		else
			post.setPosterName(posterName);
		
		// make it to string with few images
		if(imageName != null) {
			post.setImageName(imageName[0]);
			post.setImageId(imageId[0]);
		}
		
		post.setMessage(message);
		manage.createPost(post, parentPostId);
	}
	
	
	@Override
	public void createThread() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deletePost(Integer postID) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteThread(Integer threadID) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	// GETTERS / SETTERS
	

	public Integer getParentPostId() {
		return parentPostId;
	}

	public void setParentPostId(Integer parentPostId) {
		this.parentPostId = parentPostId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String[] getImageName() {
		return imageName;
	}

	public void setImageName(String[] imageName) {
		this.imageName = imageName;
	}

	public String[] getImageId() {
		return imageId;
	}

	public void setImageId(String[] imageId) {
		this.imageId = imageId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setManage(ManageDAO manage) {
		this.manage = manage;
	}

	
}
