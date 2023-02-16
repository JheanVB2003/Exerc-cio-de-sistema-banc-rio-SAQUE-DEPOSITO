package entities;

public class Banco {
	
	private int accontNumber;
	private String name;
	private Double balance = 0.0;
	
	public Banco(int accontNumber, String name) { //construtor caso a decisão seja não
		this.accontNumber = accontNumber;//pois não precisará depositar valor inicial
		this.name = name;
	}

	public Banco(int accontNumber, String name, Double balance) {//caso a decisão seja sim
		this.accontNumber = accontNumber;
		this.name = name;
		this.balance = balance;//altera o valor no depósito inicial
	}

	public int getAccontNumber() {
		return accontNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void amountDeposit(Double amount) { //calculo do depósito
		balance += amount;
	}
	
	public void amountWithdraw(Double amount) { // calculo de saque com taxa de 5 reias
		balance -= amount + 5;
		
	}


	public String toString() { //toString para imprimir os resultados
		return "Account: "
		+ accontNumber
		+ ", Holter: "
		+ name
		+ ", Balance: $"
		+ String.format("%.2f", balance);
		}

	
	

}
