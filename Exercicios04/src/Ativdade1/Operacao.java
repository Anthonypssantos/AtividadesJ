package Ativdade1;

import javax.swing.JOptionPane;

public class Operacao {

	public void dados(String a, String b, String c) {
		String dados = "";
		String[] dado = new String[3];
		
		dado[0] = a;
		dado[1] = b;
		dado[2] = c;
		
		JOptionPane.showMessageDialog(null, "Nome: "+dado[0]+"\nData de Nascimento: "+dado[1]+"\nAltura: "+c);
		
	}
	
}
