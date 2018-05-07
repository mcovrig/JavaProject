package g30126.covrig.mihaela.l7.e3;

import java.util.TreeSet;

public class Bank {
	private TreeSet<BankAccount> bankAccount;

	public Bank(TreeSet<BankAccount> bankAccounts) {
		this.bankAccount=bankAccounts;
	}
	public 	void addAccounts(String owner,double balance) {
		bankAccount.add(new BankAccount(owner, balance));
	}
	public void printAccounts() {
		for(BankAccount x:bankAccount)
		{		
			System.out.println(x.getOwner()+" "+x.getBalance());
		}
	}
	public void printAccount(double minBalance,double maxBalance) {
		for(BankAccount x:bankAccount)
		{
			if(x.getBalance()>=minBalance && x.getBalance()<=maxBalance)
			{
				System.out.println(x.getOwner()+" "+x.getBalance());
			}
		}
	}
	public BankAccount getAccounts(String owner)
	{
		for(BankAccount x:bankAccount)
		{
			if(x.getOwner().equals(owner))
			{
				return x;
			}
		}
		return null;
	}
	public TreeSet<BankAccount> getAllAccount()
	{
		return bankAccount;
	}

}