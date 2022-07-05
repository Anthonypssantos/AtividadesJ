package Ativdade1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacao op = new Operacao();
		String a, b, c;
		String[] r = new String[3]; 
		
		a = JOptionPane.showInputDialog("Coloque seu nome");
		b = JOptionPane.showInputDialog("Sua data de nascimento");
		c = JOptionPane.showInputDialog("Coloque sua altura");

		op.dados(a, b, c);
		
	}

}
