package Atividade1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao op = new Operacao();
		
		int a=0, c=0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero inteiro"));
		
		c = op.numero(a);
		
		
		
	}
}
