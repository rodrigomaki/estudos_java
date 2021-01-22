 package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// upcasting - convertendo businessAccount para uma account
		
		Account acc1 = bacc; //  uma conta empresarial é uma conta, então nao dá erro
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0); // tb nao dá erro
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // tb nao dá erro
		
		// downcasting - convertendo da super classe para a sub classe
		
		//BusinessAccount bacc2 = acc2; //--> erro - mesmo instanciado com BusinessAccount, ela ainda é uma account
		BusinessAccount bacc2 = (BusinessAccount)acc2;
		bacc2.loan(100.0);
		
		//BusinessAccount bacc3 = (BusinessAccount)acc3; // aqui bacc3 recebe por casting uma Account acc3 que foi instanciada como uma SavingsAccounts = SO DA ERRO NA EXECUCAO

		// tem que testar primeiro se acc3 é uma instancia do BusinessAccount
		BusinessAccount bacc3 = new BusinessAccount(); // só pra tirar o erro
		if (acc3 instanceof BusinessAccount) {
			bacc3 = (BusinessAccount)acc3;
			((BusinessAccount) acc3).loan(100.0);
			System.out.println("Loan");
		}
		
		// só pra tirar os erros:
		System.out.println(acc);
		System.out.println(acc1);
		System.out.println(bacc3);
		
		
		
	}

}
