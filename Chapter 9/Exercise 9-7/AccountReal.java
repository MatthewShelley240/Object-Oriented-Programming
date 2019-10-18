import java.util.Date;

public class AccountReal {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();
	
	
	AccountReal() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	AccountReal(int newID, double newBalance, double newAnnualInterestRate) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		
	}
	
	int getID() {
		return id;
	}
	
	double getWithdraw(double amount) {
		return balance - amount;
	}
	
	double getDeposit(double amount) {
		return balance - amount;
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