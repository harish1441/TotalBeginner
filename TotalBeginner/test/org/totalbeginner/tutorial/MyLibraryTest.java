package org.totalbeginner.tutorial;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyLibraryTest {
	
	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;
	private MyLibrary ml;

	@Test
	public void testMyLibrary() {
	
	 MyLibrary ml = new MyLibrary("test");
	 
	 assertEquals("test", ml.name);
	 
	 assertTrue(ml.books instanceof ArrayList);
	 assertTrue(ml.people instanceof ArrayList);
	   
		}
	
	public void setup() {
		
		// Create Objects
		
		 b1 = new Book("Book 1");
		 b2 = new Book("Book 2");
		 
		 p1 = new Person();
		 p2 = new Person();  
		 
		 p1.setName("Fred");
		 p2.setName("Sue"); 
		 
		 ml = new MyLibrary("test");
		
	}
	
	
	public void testAddBook() {
		
		assertEquals(0, ml.getBooks().size());
		
		ml.addBook(b1);
		ml.addBook(b2);
		
		assertEquals(2, ml.books.size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b1);
		
		assertEquals(1, ml.books.size());
		assertEquals(0, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b2);
		assertEquals(0, ml.getBooks().size());
		
				
		
	}
	
	public void testCheckout() {
		
		setup();
		
		ml.addBook(b1);
		ml.addBook(b1);
		ml.addPerson(p1);
		ml.addPerson(p2);
		
		assertTrue("Book did not checkout correctly", ml.checkout(b1,p1));		
		
		assertEquals("Fred", b1.getPerson().getName());
		
		assertFalse("Book was already checked out", ml.checkout(b1, p2));
		
		assertTrue("Book checkin falied", ml.checkIn(b1));
		
		assertFalse("Book was already checked in", ml.checkIn(b1));
		
		assertFalse("Book was never checked out", ml.checkIn(b2));	
		
		
		
	}

}
