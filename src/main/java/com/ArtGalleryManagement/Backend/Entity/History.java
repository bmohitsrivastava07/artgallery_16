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
@Table(name="history")
public class History {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="history_id")
   private int historyId;
	@Column(name="user_email")
   private String userEmail;
	@Column(name="checkout_date")
   private String checkoutDate;
	@Column(name="return_date")
   private String returnDate;
	@Column(name="product_title")
   private String productTitle;
	@Column
   private String artist;
	@Column(name="product_description")
   private String productDescription;
	@Column(name="product_Image")
   private String productImage;
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	public History(String userEmail, String checkoutDate, String returnDate, String productTitle, String artist,
			String productDescription, String productImage) {
		super();
		this.userEmail = userEmail;
		this.checkoutDate = checkoutDate;
		this.returnDate = returnDate;
		this.productTitle = productTitle;
		this.artist = artist;
		this.productDescription = productDescription;
		this.productImage = productImage;
	}
	
	
}
