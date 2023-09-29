package JavaModule3STATEMENTS;
import java.util.Scanner;
public class BankingApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount obj = new BankAccount( "Bhavya", "3689");
		obj.showMenu();
	}
}
	class BankAccount{
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;
		
		BankAccount(String cname, String cid){
			customerName = cname;
			customerId = cid;	
		}
		void deposit(int amount) {
			if(amount != 0) {
				balance = balance + amount;
				previousTransaction = amount;
			}
		}
		void withdraw(int amount) {
			if(amount != 0) {
				balance = balance - amount;
				previousTransaction = -amount;
		}
	}
		void getpreviousTransation() {
			if(previousTransaction >0) {
				System.out.println("Deposited: "+ previousTransaction);
			}
			else if(previousTransaction <0) {
				System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
			}
			else {
				System.out.println("No transation  is occured!");
			}
		}
		void showMenu() {
			char option ='\0';
			Scanner sc = new Scanner(System.in); 
			System.out.println("Welcome "+customerName);
			System.out.println("Your ID is: "+ customerId);
			System.out.println();
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Previous Transaction");
			System.out.println("E. Exit");
			do {
				System.out.println("Enter the option");
				option = sc.next().charAt(0);
				switch(option) {
					case 'A':
						System.out.println("Balance is: "+balance);
						System.out.println();
						break;
					case 'B':
						System.out.println("Enter the amount to deposit");
						int amount = sc.nextInt(); 
						deposit(amount);
						System.out.println("Amount Deposited:"+amount);
						break;
					case 'C':
						System.out.println("Enter the amount to withdraw");
						int amount2 = sc.nextInt();
						withdraw(amount2);
						System.out.println("Amount Withdraw:"+amount2);
						break;
					case 'D':
						System.out.println("Previous Transaction");
						getpreviousTransation();
						System.out.println("==============================");
						System.out.println();
						break;
					case 'E':
						System.out.println("===============================");
						break;

					default:
						System.out.println("Invalid option! please try again");
						break;	
				}
			}while(option != 'E');
		}
	}
