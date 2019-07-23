package com.safeYourStep.yourSafeStepEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Manafement_Data")
public class UserMaintailData {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "Safe_Rating")
	private Long SafeRating;
	
	@Column(name = "Safe_Time")
	private String SafeTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Long getSafeRating() {
		return SafeRating;
	}

	public void setSafeRating(Long safeRating) {
		SafeRating = safeRating;
	}

	public String getSafeTime() {
		return SafeTime;
	}

	public void setSafeTime(String safeTime) {
		SafeTime = safeTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
