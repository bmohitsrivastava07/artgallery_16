package com.ArtGalleryManagement.Backend.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.ArtGalleryManagement.Backend.Entity.Messages;

public interface MessageRepository extends JpaRepository<Messages, Integer>{
   Page<Messages> findByUserEmail(@RequestParam("user_email") String userEmail,Pageable pageable);
   Page<Messages> findByClosed(@RequestParam("closed") boolean closed,Pageable pageable);
}
