package Pacote;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		  Modifiquei o code 
		  
		  pv recebendo outra comparação com + 2 arrays list, gab recebendo tudo junto em ordem com 2 arrayLists, case prova coloquei só 2 if tipo String, 
		  
		  recebe nota na classe pv está bungando
		  
		  
		 */
		
		Prova p = new Prova();
			
		int casos=0, alunos=0, total=0;
		
		boolean v = true;
		
			do {
				
				casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar o total de alunos\n2 para Começar a prova\n4 para sair"));
			
				switch(casos) {
				
				case 1:{
					
					total = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de alunos que desejas adicionar"));
					
					alunos = p.aluno(total);
					
					break;
				}
				case 2:{
				
					p.addnota(alunos);
					
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
