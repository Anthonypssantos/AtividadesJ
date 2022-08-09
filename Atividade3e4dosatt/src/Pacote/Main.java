package Pacote;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		/*
		 
		  Modifiquei o code 
		  
		  pv recebendo outra comparação com + 2 arrays list, gab recebendo tudo junto em ordem com 2 arrayLists, case prova coloquei só 2 if tipo String, 
		  
		  recebe nota na classe pv está bungando
		  
		  
		 */
		
		ArrayList<String> acertos = new ArrayList<>();
		ArrayList<String> certouerrad = new ArrayList<>();
		
		
		Prova p = new Prova();
		String vai=" ";
		int casos=0, alunos=0, total=0;
		
		boolean v = true;
		
			do {
				
				casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar o total de alunos\n2 para Começar a prova\n3 para ver o gabarito\n4 para sair"));
			
				switch(casos) {
				
				case 1:{
					
					total = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de alunos que desejas adicionar"));
					
					alunos = p.aluno(total);
					
					break;
				}
				case 2:{
				
				vai	= p.addnota(alunos);
					
				certouerrad.add(vai);
				
					break;
				}
				
				case 3:{
					
					for(int i = 0; i < certouerrad.size(); i++) {
						
						System.out.println(certouerrad.get(i));
						
					}
							
					
					
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
