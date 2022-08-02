package Atividade2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data dt = new Data();
		
		boolean a = true;
		
		String casos;
		
		do {
			
			casos = JOptionPane.showInputDialog("Deseja entrar no relogiio?\nsudo relogio\nsudo sair'");
			
			
			switch(casos) {
			 
			case "sudo relogio":{
				
				dt.construtor();
				
				break;
			}
			
			default:{
				
				a = false;
				
				break;
			}
			
			}
						
			
		}while(a == true);
		
		
	}

}
