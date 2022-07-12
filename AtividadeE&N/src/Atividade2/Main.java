package Atividade2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacao2 op = new Operacao2();
		
		String Newton, Isaac, nome, Nenvia, Ienvia;	
		
		nome = JOptionPane.showInputDialog("Coloque seu nome");
		
		JOptionPane.showMessageDialog(null, nome);
		
		Nenvia = JOptionPane.showInputDialog("Deseja entrar na escola de newton?Sim ou não");	
		Ienvia = JOptionPane.showInputDialog("Deseja entrar na escola de isaac?Sim ou não");
			
		op.universidade(nome, Nenvia, Ienvia);
	
	}

}
