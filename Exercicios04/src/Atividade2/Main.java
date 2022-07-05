package Atividade2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao op = new Operacao();
		int index = 0, idade=0, casos=0;
		String nome;
		float altura;
		boolean c1=true;
		
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar na tabela de dados\n 2 para remover um pessoa\n 3 para Buscar a posição de uma pessoa\n4 para imprimir tudo\n5 para imprimir dados especificos de uma pessoa\n"));
			
			switch(casos) {
			
			case 1:{
				
				op.armazenaP();
				
				break;
				}
			
			case 2:{
				//erro aqui, remover usuario esta bugado
				op.removeP();
				
				break;
				}
			
			case 3:{
				
				
				
				break;
				}
			
			case 4:{
				
				
				
				break;
			}
			
			
			case 5:{
				
				
				
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
