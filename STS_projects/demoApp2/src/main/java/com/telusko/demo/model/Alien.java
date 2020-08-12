package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String title;
	private String category;
	private String description;
	private String startdate;
	private String enddate;
	private String officiallink;
	private String image;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getOfficiallink() {
		return officiallink;
	}
	public void setOfficiallink(String officiallink) {
		this.officiallink = officiallink;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
