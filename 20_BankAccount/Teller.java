/**
Ocho!: Nora,, Tasnim, Hamim
10-19-2021
QCC:
**/

public class Teller { 

	public static void main(String[] args) {
		//You can deposit negative values to get negative balance
		BankAccount ba = new BankAccount();
		ba.setName("John");
    		ba.setPasswd("p");
    		ba.setPin((short) 1234);
    		ba.setAcctNum(123456789);
    		ba.setBalance(50.00);
    		ba.deposit(-500.00);
    		ba.withdraw(10.00);
    		
    		System.out.println(ba.toString());
    		
    		//Testing negative balance
    		BankAccount acc = new BankAccount();
		acc.setName("bob");
    		acc.setPasswd("p");
    		acc.setPin((short) 12345);
    		acc.setAcctNum(123456780);
    		acc.setBalance(-50.00);
    		acc.deposit(50.00);
    		acc.withdraw(10.00);
    		    		
    		System.out.println(acc.toString());
		}
	
}


