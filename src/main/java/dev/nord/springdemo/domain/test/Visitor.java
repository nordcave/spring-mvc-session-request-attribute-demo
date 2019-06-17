package dev.nord.springdemo.domain.test;

import java.io.Serializable;

// Incapsulate data related to a visitor
public class Visitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4516483862322486349L;
	
	private String name;
	private String email;
	
	public Visitor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", email=" + email + "]";
	}

}
