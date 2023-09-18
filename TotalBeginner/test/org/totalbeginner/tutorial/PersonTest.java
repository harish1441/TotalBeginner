package org.totalbeginner.tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	
	@Test
	void testPerson() {
		Person person = new Person();
		assertEquals("unknown name",  person.getName());
		assertEquals(3, person.getMaximumBooks());
	}

	@Test
	void testSetName() {
		 Person P2 = new Person();
		 P2.setName("Fred");
		 assertEquals("Fred", P2.getName());
	}

	@Test
	void testSetMaximumBooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(10);
		assertEquals(10, p3.getMaximumBooks());
	}
	
	@Test
	public void testToString() {
		
		Person p4 = new Person();
		p4.setName("Faf Du Plessis");
		assertEquals("Faf Du Plessis (3 books)", p4.toString());
		
		
	}	
	

}
