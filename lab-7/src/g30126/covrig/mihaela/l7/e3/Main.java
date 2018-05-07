package g30126.covrig.mihaela.l7.e3;

import java.util.TreeSet;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		TreeSet<BankAccount> bankAccounts=new TreeSet<BankAccount>();
		Bank bank=new Bank(bankAccounts);
		bank.addAccounts("haralamb", 50);
		bank.addAccounts("ismail", 500);
		bank.addAccounts("libelul", 1000);
		bank.addAccounts("acad", 5000);
		bank.printAccounts();
		bank.printAccount(40, 100);
		System.out.println(bank.getAllAccount());

	}
}