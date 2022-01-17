public class BankClass {

	public double balance = 1000;
	public double withdraw1;
	public double deposit1;
	
	public void BankClass(double withdraw1, double deposit1) {
			this.withdraw1 = withdraw1;
			this.deposit1 = deposit1;
	}
//ensures withdrawal amount is a positive number	
	public void setWithdraw(double withdraw1) {
		if (withdraw1 > 0) {
			this.withdraw1 = withdraw1;
		} else {
			throw new IllegalArgumentException("withdrawal amount can't be negative");
			
		}
	}
//ensures deposit amount is a positive number	
	public void setDeposit(double deposit1) {
		if (deposit1 > 0) {
			this.deposit1 = deposit1;
		} else {
			throw new IllegalArgumentException("deposit amount can't be negative");
		}
	}
//function for withdrawing funds and getting the new balance after	
	public double getWithdraw(double withdraw1) {
		balance = balance - withdraw1; 
		if (balance < 0) {
			System.out.println("Insufficient funds");
		}
		return balance;
	}
//function to get current balance	
	public double getBalance() {
		return balance;
	}
//function for depositing and getting the new balance	
	public double getDeposit(double deposit1) {
		balance = balance + deposit1;
		return balance;
	}
}