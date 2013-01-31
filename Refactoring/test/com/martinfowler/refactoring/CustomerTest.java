package com.martinfowler.refactoring;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testAddRental() {
		Customer customer = new Customer("Sallie");
		Movie movie = new Movie("Gone with the Wind", Movie.REGULAR);
		Rental rental = new Rental(movie, 3); // 3 day rental
		customer.addRental(rental);
	}

    @Test
	public void testGetName() {
		Customer customer = new Customer("David");
		assertEquals("David", customer.getName());
	}

    @Test
    public void testStatementForRegularMovie() {
		Customer customer = new Customer("Sallie");
		Movie movie = new Movie("Gone with the Wind", Movie.REGULAR);
		Rental rental = new Rental(movie, 3); // 3 day rental
		customer.addRental(rental);
		String expected = "Rental Record for Sallie\n" +
							"\tGone with the Wind\t3.5\n" +
							"Amount owed is 3.5\n" +
							"You earned 1 frequent renter points";
		String statement = customer.statement();
		assertEquals(expected, statement);
	}

    @Test
    public void testStatementForNewReleaseMovie() {
		Customer customer = new Customer("Sallie");
		Movie movie = new Movie("Star Wars", Movie.NEW_RELEASE);
		Rental rental = new Rental(movie, 3); // 3 day rental
		customer.addRental(rental);
		String expected = "Rental Record for Sallie\n" +
							"\tStar Wars\t9.0\n" +
							"Amount owed is 9.0\n" +
							"You earned 2 frequent renter points";
		String statement = customer.statement();
		assertEquals(expected, statement);
	}

    @Test
    public void testStatementForChildrensMovie() {
		Customer customer = new Customer("Sallie");
		Movie movie = new Movie("Madagascar", Movie.CHILDRENS);
		Rental rental = new Rental(movie, 3); // 3 day rental
		customer.addRental(rental);
		String expected = "Rental Record for Sallie\n" +
							"\tMadagascar\t1.5\n" +
							"Amount owed is 1.5\n" +
							"You earned 1 frequent renter points";
		String statement = customer.statement();
		assertEquals(expected, statement);
	}

    @Test
    public void testStatementForManyMovies() {
		Customer customer = new Customer("David");
		Movie movie1 = new Movie("Madagascar", Movie.CHILDRENS);
		Rental rental1 = new Rental(movie1, 6); // 6 day rental
		Movie movie2 = new Movie("Star Wars", Movie.NEW_RELEASE);
		Rental rental2 = new Rental(movie2, 2); // 2 day rental
		Movie movie3 = new Movie("Gone with the Wind", Movie.REGULAR);
		Rental rental3 = new Rental(movie3, 8); // 8 day rental
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		String expected = "Rental Record for David\n" +
							"\tMadagascar\t6.0\n" +
							"\tStar Wars\t6.0\n" +
							"\tGone with the Wind\t11.0\n" +
							"Amount owed is 23.0\n" +
							"You earned 4 frequent renter points";
		String statement = customer.statement();
		assertEquals(expected, statement);
	}
}
