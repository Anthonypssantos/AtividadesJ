package Atividade4;

import javax.swing.JOptionPane;

public class Operacao {

	public int canal(int r, String[] canais){
		int canal = 0;
		
		JOptionPane.showMessageDialog(null, "Canal escolhido: "+ canais[r]);
			
		return canal;
	
	}
	
	public int subir(int v) {
		
			if (v == 100) {
				
				JOptionPane.showMessageDialog(null, "Volume maximo 100");
				 
				
			}else {
				
				v++;
				
			}

		return v;
	
	}
	
	public int descer(int v) {
		
		if (v == 0) {
			
			JOptionPane.showMessageDialog(null, "Volume minimo");
			
		}else {
			
			v--;
					
		}
		
		return v;
	}
	
}
