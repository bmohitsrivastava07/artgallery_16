package com.ArtGalleryManagement.Backend.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.ArtGalleryManagement.Backend.Entity.History;

public interface HistoryRepository extends JpaRepository<History, Integer>{
    Page<History> findProductsByUserEmail(@RequestParam("user_email") String userEmail, Pageable pageable);
}
