package com.ArtGalleryManagement.Backend.Service;

import com.ArtGalleryManagement.Backend.Entity.Messages;
import com.ArtGalleryManagement.Backend.Models.AdminQuestionRequest;

public interface MessageService {
	public void postMessage(Messages messageRequest,String userEmail);
	public void putMessage(AdminQuestionRequest adminQuestionRequest,String useremail) throws Exception;
}
