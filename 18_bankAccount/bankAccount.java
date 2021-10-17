/**
TPNG: Ocho- Tasnim, Nora, Hamim
HW 18 CPA-One
2021-10-14
Q2. Java is able to create instances of the class without directly making a default constructor.
Q3. Try printing the class and see if it returns a string representation of an object.
 */

public class bankAccount {
	public String holderName;
	private String password;
	private int pin;
	private int accountNum;
	private double balance;

	public bankAccount(String name, String pass, int pinn, int num) {
		holderName = name;
		password = pass;
		pin = pinn;
		accountNum = num;
		balance = 0;
	}

	public void changePassword(String newPass) {
		password = newPass;
	}

	public void changePin(int newPin) {
		pin = newPin;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void atmReceipt() {
		System.out.print(holderName + ": " + balance);
	}

public static void main( String[] args) {
	bankAccount test = new bankAccount("Ocho", "goodpassword123", 6313, 333414914);
	test.depost(1000);
	test.withdraw(53);
	test.atmReceipt();
}
}
