package org.totalbeginner.tutorial;

public class Person {
	
	//Fields
	
	private String name;    // Name of the person
	private int maximumBooks;  // Maximum number of books a person can have

	
	// Constructors
	
	public Person() {
		
		name = "unknown name";
		maximumBooks = 3;
		
	}
	
	public String getName() {		
		return name;
	}
	
	public void setName(String name) {		
		this.name =name;		
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {		
		return (this.name + " (" + this.maximumBooks + " books)");			
	}
	
	
	
}
