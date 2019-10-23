import java.util.Date;
import java.util.Scanner;

public class AccountReal {
	
	private Scanner input = new Scanner(System.in);
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	
	AccountReal() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}
	
	AccountReal(int newID, double newBalance, double newAnnualInterestRate) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = new java.util.Date();
		
	}
	
	double setBalance() {
		balance = input.nextDouble();
		return balance;
	}
	
	int setID() {
	id = input.nextInt();
	return id;
	}
	
	double setAnnualInterestRate() {
		annualInterestRate = input.nextDouble();
		return annualInterestRate;
	}
	
	int getID() {
		return id;
	}
	
	public double Withdraw(double amount) {
		return balance -= amount;
	}
	
	public double Deposit(double amount) {
		return balance += amount;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	Date getDate () {
		return dateCreated;
	}
}