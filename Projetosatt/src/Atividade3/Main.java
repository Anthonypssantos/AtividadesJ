package Atividade3;

import javax.swing.JOptionPane;

import Aividade4.prova;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prova p = new prova();
		int casos=0, f=0, h=0;
		boolean v = true;
		
			do {
				
				casos = Integer.parseInt(JOptionPane.showInputDialog("1 para prova\n2 para sair"));
			
				switch(casos) {
				
				case 1:{
					h++;
					
					p.setH(h);
					
					p.respostaAluno();
					
					break;
					}
				
				default:{
					
					v = false;
					
					break;
					}
				
				}
					
			}while(v == true);
		
	
	}

}
