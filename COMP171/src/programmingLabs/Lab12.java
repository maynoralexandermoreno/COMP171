/* OBJECTS & CLASSES (UNIT 8)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 12: ACCOUNT
 * PAGE 361 # 9.7
 * April 27, 2017

 * (The Account class) Design a class named Account that contains:
 * A private int data field named id for the account (default 0).
 * A private double data field named balance for the account (default 0).
 * A private double data field named annualInterestRate that stores the current interest rate (default 0). 
		Assume all accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the account was created.
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified id and initial balance.
 * The accessor and mutator methods for id, balance, and annualInterestRate.
 * The accessor method for dateCreated.
 * A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the account.
 * A method named deposit that deposits a specified amount to the account.
 
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. 
 * monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage,e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122,a balance of $20,000, and an annual interest rate of 4.5%. 
 * Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest,
 * and the date when this account was created.

 * Hints:
 * How many times do you need to ask the user for input?
 * How do you ignore the case?
 * There are 50 rows and 2 columns; print the state in the question by getting column element [0] 
 * Then, compare the input answer with column element [1]
 * The way you should think about this matrix is as follows
 
 				State	Capital
 	Solution 1:
 	Solution 2:
 	Solution 3:
 	
 * So there are 50 rows and 2 columns. What you are doing is inserting every row in, each row an array containing 2 elements
 
*/
package programmingLabs;

public class Lab12 {
	private int id;
	private double balance, annualInterestRate;
	private java.util.Date dateCreated;
	public Lab12(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}
	public Lab12(int id, double initialBalance){
		this.id = id;
		balance = initialBalance;
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}	
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate /1200.00;
		return monthlyInterestRate;
	}
	public double getMonthlyInterest(){
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
	}
	public void withdraw(double withdrawl){
		this.balance = this.balance - withdrawl ; 
	}
	public void deposit(double deposit) {
		this.balance = this.balance + deposit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}
