package Atividade4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao op = new Operacao();
		String[] canais = new String[5];
		 
		canais[0] = "Culinaria";
		canais[1] = "Sports";
		canais[2] = "Ação";
		canais[3] = "Comedia";
		canais[4] = "TNT";
		
		boolean c1 = true;
		int casos=0, r=0, v=0;
		
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para trocar de canal\n2 para aumentar o volume\n3 para diminuir o volume\n4 para desligar a tv"));
			
			switch(casos) {
			
			case 1:{
				
				r = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero do canal\nVocê tem 4 canais disponiveis"));
				
				op.canal(r, canais);
				
				break;
			}
			
			case 2:{
				
				
				
				v = op.subir(v);
				
				JOptionPane.showMessageDialog(null, v);
				
				break;
			}
			
			case 3:{
				
				v = op.descer(v);
				
				JOptionPane.showMessageDialog(null, v);
				
				break;
			}
			
			default:{
				
				c1 = false;
				
				break;
			}
			
			}
					
		}while(c1 == true);
		
		
	}

}
