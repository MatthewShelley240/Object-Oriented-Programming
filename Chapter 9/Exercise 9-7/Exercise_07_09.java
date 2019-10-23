/*
 * Matthew Shelley
 * 10/17/2019
 * Exercise 7-9 Does some bank like stuff.
 */
public class Exercise_07_09 {

	public static void main(String[] args) {
		// Calls the default account

		AccountReal account1 = new AccountReal();
		System.out.println("The default account id is " + account1.getID());
		System.out.println("The default account balance is " + account1.getBalance());
		System.out.println("The default account monthly interest is " + account1.getMonthlyInterest());
		System.out.println("The date the default account was created was " + account1.getDate());
		System.out.println("\n");

		AccountReal account2 = new AccountReal(1122, 20000, 4.5);
		account2.getWithdraw(2500);
		account2.getDeposit(3000);
		System.out.println("The account id is " + account2.getID());
		System.out.println("The account balance is " + account2.getBalance());
		System.out.println("The account monthly interest is " + account2.getMonthlyInterest());
		System.out.println("The date the saccount was created was " + account2.getDate());
	}

}
