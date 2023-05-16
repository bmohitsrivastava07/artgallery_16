package com.ArtGalleryManagement.Backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArtGalleryManagement.Backend.Entity.Messages;
import com.ArtGalleryManagement.Backend.Models.AdminQuestionRequest;
import com.ArtGalleryManagement.Backend.Service.MessageService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/messages")
public class MessageController {
	@Autowired
	MessageService messageService;

	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	@PostMapping("/secure/add/message")
	public void postMessage(@RequestBody Messages messageRequest) {
		String userEmail="mohit@gmail.com";
		messageService.postMessage(messageRequest, userEmail);
	}
	
	@PutMapping("/secure/admin/message")
	public void putMessage(@RequestBody AdminQuestionRequest adminQuestionRequest)throws Exception{
		String userEmail="admin@gmail.com";
		String admin ="admin";
		if(admin==null || !admin.equals("admin")) {
			throw new Exception("Administration page only");
		}
		messageService.putMessage(adminQuestionRequest, userEmail);
	}
	
	
	
}
