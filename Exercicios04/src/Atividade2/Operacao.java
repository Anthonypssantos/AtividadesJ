package Atividade2;

import javax.swing.JOptionPane;

public class Operacao {
	//armazena dados
	public String[] armazenaP(String[] dados) {
		
		for (int i = 0; i < 10; i++) {
			
			dados[i] = JOptionPane.showInputDialog(null, "Informe seu nome");
			
		}
		
		return dados;
	
	}
	
	//remove a pessoa
	public String[] removeP(String[] dado, int r) {
				
			dado[r] = null;

		return dado;
	}
	//busca a posição
	public String[] buscP(String[] dado, int r) {
		
		
		JOptionPane.showMessageDialog(null, dado[r]);
		
		
		return dado;
	}
	
	//imprime tudo
	public String[] imprAg(String[] dado) {
		
		for(int i = 0; i < 10; i++) {
		
			System.out.println(dado[i]);
			
		}
		
		return dado;
	}

}
