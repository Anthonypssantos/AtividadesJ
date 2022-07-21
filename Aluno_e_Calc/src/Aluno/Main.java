package Aluno;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JOptionPane.showMessageDialog(null, nome.toString());
		
		Controle controle = new	Controle();	
		ArrayList<String> nome= new ArrayList<>();
		
		int n1,n2,casos=0, p_ou_n;
		String c1 = "inicio", nomes;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar seu nome\n2 para adicionar as notas\n3 para ver se você passou\n4 para sair"));
			
			switch(casos) {
			
			//nome e nota
			case 1:{
				
				int t=0;
				
				t = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero de alunos que desejas cadastrar"));
				
				for (int i = 0; i < t; i++) {
					
					nomes = JOptionPane.showInputDialog("Nome");
					
					if(nomes.equals("fim")) {
						
						t = 0;
						c1 = "fim";
						nomes = null;
					
					}
					
					nome.add(nomes);	
					
				}
				
				controle.setNome(nome);
				
				break;
			}
			
			case 2:{
				
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Nota (1)\nInsire sua nota de 1 a 100"));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Nota (2)\nInsire sua nota de 1 a 100"));
				p_ou_n = n1 - n2;
				
				if(p_ou_n > 100) {
				
					p_ou_n = 0;
					JOptionPane.showMessageDialog(null, "Calma lá meu pacero. Nota acima de 100 num da. Tá OK?");
					
				}
				controle.setP_ou_n(p_ou_n);
				
				break;
			}
			
			case 3:{
				
				controle.getNome();
				controle.getP_ou_n();
				
				break;
			}
			
			default:{
				
				c1 = "fim";
				break;
			}
			
			
			}
			
		}while(c1 == "inicio");
		
		
	
	}
}
