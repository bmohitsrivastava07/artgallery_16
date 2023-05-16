package com.ArtGalleryManagement.Backend.Models;

import lombok.Data;

@Data 
public class AdminQuestionRequest {
    private int message_id;
    private String response;
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
    
}
