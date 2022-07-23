package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TODO: Unit Test
class MoneyTest {

	private final Money m12CHF = new Money(12, Currency.CHF);
	private final Money m14CHF = new Money(14, Currency.CHF);

//	TODO: Test annotation
	@Test
	void testSimpleAdd() {
		Money expected = new Money(26, Currency.CHF); //TODO: expected output of the method
		Money observed = m12CHF.add(m14CHF); //TODO: actual output of the method
		// TODO: implement the assertion of expected and observed/actual outcome
		assertEquals(expected, observed);
	}

	@Test
	void testSimpleSubtract() {
		Money expected = new Money(2, Currency.CHF);
		Money observed = m14CHF.subtract(m12CHF);
		// Task 3: implement the test case
		assertEquals(expected, observed);
	}

	@Test
	void testInvalidAdd() {
		Money m14USD = new Money(14, Currency.USD);
		// TODO: Task 4: implement the test case: throw class and the method call that causes the Exception
		assertThrows(IllegalArgumentException.class, () -> { m12CHF.add(m14USD); });
	}
}
