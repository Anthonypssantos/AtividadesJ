package funcao3;

import javax.swing.JOptionPane;

public class Main {
	
	public static int idades(int a) {
		int idade=0;
		
		idade = a;
		
		if (idade == 5 || idade == 7) {
			
			JOptionPane.showMessageDialog(null, "Infantil");
			
		}
		
		if (idade == 8 || idade == 10) {
					
					JOptionPane.showMessageDialog(null, "Juvenil");
					
				}
			
		if (idade == 11 || idade == 15) {
			
			JOptionPane.showMessageDialog(null, "Adolescente");
			
		}
		
		if (idade == 16 || idade == 30) {
			
			JOptionPane.showMessageDialog(null, "Adulto");
			
		}
		
		if (idade > 30) {
			
			JOptionPane.showMessageDialog(null, "Sênior");
			
		}
		
		return idade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade"));
		
		idades(a);
		
	}
}
