package com.ArtGalleryManagement.Backend.Service;

import java.util.Optional;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ArtGalleryManagement.Backend.Entity.Messages;
import com.ArtGalleryManagement.Backend.Models.AdminQuestionRequest;
import com.ArtGalleryManagement.Backend.Repository.MessageRepository;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepository;

	public MessageServiceImpl(MessageRepository messageRepository) {
		super();
		this.messageRepository = messageRepository;
	}
	
	public void postMessage(Messages messageRequest,String userEmail) {
		Messages message=new Messages(messageRequest.getProductTitle(),messageRequest.getQuestion());
		message.setUserEmail(userEmail);
		messageRepository.save(message);
	}
	
	public void putMessage(AdminQuestionRequest adminQuestionRequest,String useremail) throws Exception{
		Optional<Messages> message=messageRepository.findById(adminQuestionRequest.getMessage_id());
		if(!message.isPresent()) {
			throw new Exception("Message not found");
		}
		message.get().setAdminEmail(useremail);
		message.get().setResponse(adminQuestionRequest.getResponse());
		message.get().setClosed(true);
		messageRepository.save(message.get());
		
	}
}
