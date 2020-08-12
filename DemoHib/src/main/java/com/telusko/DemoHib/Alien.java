package com.telusko.DemoHib;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// @Entity(name="Alien_table") or
// @Table(name="alien_table")
@Entity
public class Alien {
	@Id
	private int aid;
	private AlienName aname;
	//@Column(name="Alien_color")
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
