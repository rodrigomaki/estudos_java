package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String args[]) {
		
		// testando sobreposicao
		
		Account acc1 = new Account(1001, "Alex", 1000.00);
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		
		
		acc1.withdraw(100.0);
		acc2.withdraw(100.0);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		
		// testando sobreposicao super - aproveitando o método da super classe
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 100.00);
		
		acc3.withdraw(100.0);
		
		System.out.println(acc3.getBalance());
		
	}
	
}
