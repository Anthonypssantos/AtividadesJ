package Atividade3;

import javax.swing.JOptionPane;

import Aividade4.Provareturna;
import Aividade4.prova;

public class Main extends Provareturna{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Provareturna pv = new Provareturna();
		prova p = new prova();
		int casos=0, f=0, h=0, r=0, total=0, racertos=0;
		double rnota=0.0;
		boolean v = true;
		
			do {
				
				casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar o total de alunos\n2 para Começar a prova\n3 para ver o gabarito\n4 para sair"));
			
				switch(casos) {
				
				case 1:{
					
					total = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de alunos que desejas adicionar"));
					
					p.aluno(total);
					
					break;
				}
				case 2:{
					
					p.addnota();
					
					break;
				}
				
				case 3:{
					
					p.gabarito();
					
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
