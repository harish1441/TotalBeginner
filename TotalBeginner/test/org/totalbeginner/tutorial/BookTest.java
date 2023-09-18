package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class BookTest {
	
	@Test
	public void testBook() {
		
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
		
	}
	
	public void testGetPerson() {
		
		Book b2 = new Book("War and Peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		//Method to identify who has the book
		b2.setPerson(p2);
		
		//Get the name of the person who has the book
		String testName = b2.getPerson().getName();
		
		assertEquals("Elvis", testName);
		
		
		
	}


}
