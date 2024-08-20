package prjAtividade02;

public class ContaBancaria {
	
	// Atributos
	
	private int numeroConta; 
	private String nomeTitular;
	private double saldo;
	
	// Construtores
	
	public ContaBancaria() {
	}
	
	
	public ContaBancaria(int numeroConta, String nomeTitular, double saldoConta) {
		
		this.numeroConta = numeroConta; 
		this.nomeTitular = nomeTitular; 
		this.saldo = saldoConta;        
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}