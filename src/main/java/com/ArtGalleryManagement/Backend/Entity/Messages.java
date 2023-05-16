package com.ArtGalleryManagement.Backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="messages")
public class Messages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int messageId;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="product_title")
	private String productTitle;
	@Column
	private String question;
	@Column(name="admin_email")
	private String adminEmail;
	@Column
	private String response;
	@Column
	private boolean closed;
	
	public Messages(String productTitle, String question) {
		super();
		this.productTitle = productTitle;
		this.question = question;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public boolean getClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	
	

}
