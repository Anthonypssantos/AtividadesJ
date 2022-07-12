package Atividade;

import javax.swing.JOptionPane;

public class Operacoes {
	
	private String nome;
	private int saldo;
	private int deposito;
	
	public void cadastro(String nome) {
		this.nome = nome;
		
		
	}
	
	public void setSaldo(int saldo) {
		this.saldo += saldo;
		this.deposito -= saldo;

		JOptionPane.showMessageDialog(null, "Você retirou: "+ saldo+ " reais");
	}
	public int getDeposito() {
		
		JOptionPane.showMessageDialog(null, "Nome: "+nome+" Saldo: "+saldo);
		
		
		return deposito;
	
	}
	public void setDeposito(int deposito) {
		this.deposito += deposito;
		JOptionPane.showMessageDialog(null, "Você depositou: "+ deposito+ " reais");
	}
		
}
