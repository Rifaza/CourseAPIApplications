package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/* We need to map object of this class to relational database table. 
 * Using the annotation we are creating the 
 * table.
It will be convert topic instance into raw in the database, 
and it will convert raw bin the database into topic instance in the database.It is an Entity mappping */

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String descriptions;
	public Topic() {
		
	}
	
	public Topic(String id, String name, String descriptions) {
		super();
		this.id = id;
		this.name = name;
		this.descriptions = descriptions;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	

}
