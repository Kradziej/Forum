package forum;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table (name="posts")
public class PostEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="postID")
	private Integer postId;
	@Column(name="posterName", length = 50)
	private String posterName;
	@Column(name="message")
	private String message;
	@Column(name="imageName", length = 150)
	private String imageName;
	@Column(name="imageID", length = 150)
	private String imageId;
	@Column(name="date")
	private Date date;
	
	PostEntity() {}
	
	@PrePersist
	public void createTimestamp() {
		this.date = new Date();
	}
	
	
	
	// GETTERS SETTERS
	

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

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}


