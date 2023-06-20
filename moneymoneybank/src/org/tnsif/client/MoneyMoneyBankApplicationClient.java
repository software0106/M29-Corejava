package org.tnsif.client;
import in.tnsif.application.MMCurrentAcc;
import in.tnsif.application.MMSavingAcc;
import in.tnsif.application.MMBankFactory;
import in.tnsif.framework.CurrentAcc;
import in.tnsif.framework.SavingAcc;
import in.tnsif.framework.BankFactory;
public class MoneyMoneyBankApplicationClient {
	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(678, "Aishwarya Shinde", 90, true);
		CurrentAcc c = new MMCurrentAcc(90, "Rajesh Shinde", 89, 90);
		System.out.println("Savings Account");
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		c.withdraw(s.getAccBal());
		System.out.println(s);
		System.out.println(c);
		
	}
}
