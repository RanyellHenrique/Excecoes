package entities;

import entities.exceptions.RExeptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount) throws RExeptions {
		if(amount > withdrawLimit) { //limite de saque menor que o valor pedido.
			throw new RExeptions(" The amount exceeds withdraw limit");
		}
		if (balance < amount) {// saldo indisponivel.
			throw new RExeptions("Not enough balance");
		}
		balance -= amount;
	}
	
}
