package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Banco bank = null; //método da conta banco
		System.out.print("Enter account number: "); 
		int number = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter account holter: ");
		String holder = scan.nextLine();
		System.out.println("Is there na initial deposit (y/n)?: ");
		char decid = scan.next().charAt(0);
		
		if(decid == 'y') { 
			System.out.print("Enter initial Deposit: ");
			double initialDeposit  = scan.nextDouble();
			bank = new Banco(number, holder, initialDeposit); 
			//inicializando o construtor com saque inicial
			
		}else if(decid == 'n') {
			bank = new Banco(number, holder);
			//iniciando construtor sem saque inicial
		}
		
		System.out.println();
		System.out.println("Account data: \n"+bank);
		
		System.out.print("Enter a deposit value: ");
		Double deposit = scan.nextDouble();
		bank.amountDeposit(deposit); //adcionando o valor do depósito ao saldo 
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.print("Enter a withdraw value: ");
		Double withdraw = scan.nextDouble();
		bank.amountWithdraw(withdraw);//retirando valor de saque 
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		scan.close();
	}

}
