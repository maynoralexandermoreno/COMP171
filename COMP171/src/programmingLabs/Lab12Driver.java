/* Lab12 Driver
 * Instrutor Torres provided the driver for Lab12;
 * Use to test Lab12
 */
package programmingLabs;

import java.util.Date;

public class Lab12Driver {

	public static void main(String[] args) {
		Lab12 a1 = new Lab12();
		Lab12 a2 = new Lab12(1, 1000.00);

		System.out.println(a1.getMonthlyInterest());
		System.out.println(a2.getMonthlyInterestRate());
		System.out.println(a1.getAnnualInterestRate());
		System.out.println(a2.getBalance());
		System.out.println(a1.getId());
		System.out.println(a2.getDateCreated());

		a1.setId(11);
		a1.setAnnualInterestRate(11.11);
		a2.setBalance(22);
		a2.setDateCreated(new Date());

		Lab12 a3 = new Lab12(1122,20000.00);
		assertTrue("Test 0 - Create 20000", a3.getBalance() == 20000);
		a3.setAnnualInterestRate(4.5);
		a3.withdraw(2500);
		assertTrue("Test 1 - Withdraw 2500", a3.getBalance() == 17500);
		a3.deposit(3000);
		assertTrue("Test 2 - Deposit 3000", a3.getBalance() == 20500);

		System.out.println("Balance: " + a3.getBalance());
		System.out.println("Monthly interest: " + a3.getMonthlyInterest());
		System.out.println("Date created: " + a3.getDateCreated());
	}

	public static void assertTrue(String s, boolean b) {
		if (!b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - passed");
		}
	}

	public static void assertFalse(String s, boolean b) {
		if (b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - passed");
		}
	}

	public static void assertEquals(String s, boolean b) {
		if (b) {
			System.out.println(s + " - failed ***");
		} else {
			System.out.println(s + " - passed");
		}
	}

}
