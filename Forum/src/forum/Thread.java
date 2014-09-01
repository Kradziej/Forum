package forum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="threads")
public class Thread {
	
	@Id
	@Column(name="threadID")
	private Integer threadId;
	@Column(name="topic")
	private String topic;
	@Column(name = "order")
	private Integer order;
	
	
	Thread(Integer threadId, String topic) {
		
		this.threadId = threadId;
		this.topic = topic;
		this.order = 0;
	}

	
	// GETTERS SETTERS
	

	public Integer getThreadId() {
		return threadId;
	}


	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}

}
