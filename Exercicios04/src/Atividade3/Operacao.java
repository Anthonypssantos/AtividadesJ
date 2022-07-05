package Atividade3;

import javax.swing.JOptionPane;

public class Operacao {
	
	public void painel(int a, int rc){
		int capacidade = 250;
		
		if (a > 5)	{
			
			JOptionPane.showMessageDialog(null, "A pessoas demais no elevador");
			
		}
		
		if (a == 1) {
			
			rc = capacidade - 50;
			
		}
		
		if (a == 2) {
							
			rc = capacidade - 100;
							
		}
		
		if (a == 3) {
			
			rc = capacidade - 150;
			
		}
		
		if (a == 4) {
							
			rc = capacidade - 200;
							
		}
		
		if (a == 5) {
			
			rc = capacidade - 250;
			
		}
		
		JOptionPane.showMessageDialog(null, "Existem "+ a +" pessoas no elevador "+"\n"+ rc + " de peso disponivel");
				
	}
	
	public void subir(int a) {
		
		if (a > 5) {
			
			JOptionPane.showMessageDialog(null, "Andar inexistente");
			
		}
		
		JOptionPane.showMessageDialog(null, "Andar atual "+ a);
		
		
	}
	
	public void descer(int r) {
		
		JOptionPane.showMessageDialog(null, "Andar atual "+ r);
			
	}
	
}
