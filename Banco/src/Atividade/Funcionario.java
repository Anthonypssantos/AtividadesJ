package Atividade;

import javax.swing.JOptionPane;

public class Funcionario {
	
	//variaveis privadas
	private String nome, cpf, matricula, addms;
	private double salario;
	
	
	//==============================
	//get e set das variaveis privadas
	
	public String getNome() {
		return nome;
		
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAddms() {
		return addms;
	}

	public void setAddms(String addms) {
		this.addms = addms;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getCpf() {
		return cpf;
		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	
	
	public double getSalario() {
		return salario;
		
	}
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	//final de gets e sets das variaveis privadas
	//================================
	
	//chamadas das funções
	public void imposto() {
		
		
		
	}
			
	//ganho bruto anual
	public void gba() {
		
		this.salario = (this.salario * 12);
		
		JOptionPane.showMessageDialog(null, this.salario);
		
	}
	
	//calc ganho liquido anual
	public void cgla() {	
		
	}
	
	
	//calc ganho liquido mensal
	public void cglm() {
			
		JOptionPane.showMessageDialog(null, this.salario);	

	}
	
			
	//aumentar o salario
	public void aumento() {
		double aum;
		
		aum = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu aumento"));
		
		this.salario = (this.salario + aum);
				
	}
	
	public void ga() {
		
		
		
	}	
	
	public void dados() {
		
		JOptionPane.showMessageDialog(null, "Nome: "+this.nome+"\nSalario: "+this.salario+"\nMatricula: "+this.matricula+"\nData de Admissão: "+this.addms+"\nCpf"+this.cpf);
		
	}
	
}
