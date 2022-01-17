import java.util.Scanner;

public class BankTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankClass transaction = new BankClass();
	
			System.out.println("Pick a number 1, 2, or 3");
			System.out.println("1 check balance");
			System.out.println("2 withdraw money");
			System.out.println("3 deposit money");
			int choice = input.nextInt();
//offers choice for balance, withdrawal, or deposit			
			switch (choice) {
			case 1:
				System.out.println("Your Balance is:");
				System.out.println(transaction.getBalance());
				break;
			case 2:
				System.out.println("What ammount do you want to withdraw?");
				double withdrawamt = input.nextInt();
				transaction.setWithdraw(withdrawamt);
				System.out.println("Your withdrawal amount is:" + withdrawamt);
			
				double withdraw = transaction.getWithdraw(withdrawamt);
				System.out.println("Your new balance is: " + withdraw);
				break;
			case 3:
				System.out.println("What ammount do you want to deposit?");
				double depositamt = input.nextInt();
				transaction.setDeposit(depositamt);
				System.out.println("Your deposit amount is:" + depositamt);			
				double deposit = transaction.getDeposit(depositamt);
				System.out.println("Your new balance is: " + deposit);
				break;
			}
	}
}


