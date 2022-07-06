package Atividade2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao op = new Operacao();
		String[] dados = new String[10];
		String[] arm = new String[10];
		int index = 0, idade=0, casos=0, rmv=0, r=0;
		String nome;
		float altura;
		boolean c1=true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar na tabela de dados\n 2 para remover um pessoa\n 3 para Buscar a posição de uma pessoa\n4 para imprimir tudo\n5 para sair\n"));
			
			switch(casos) {
			
			case 1:{		
				
				arm = op.armazenaP(dados);
				
				for(int i = 0; i < 10; i++) {
					
					System.out.println(dados[i]);
							
				}
				
				break;
				
			}
			
			case 2:{
				
				r = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero do vetor que desejas remover"));
				
				op.removeP(dados, r);
				
				for(int i = 0; i < 10; i++) {
					
					System.out.println(dados[i]);
							
				}
				
				break;
				}
			
			case 3:{
				
				r = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero do vetor que desejas printar na tela"));
				
				op.buscP(dados, r);
				
				break;
				}
			
			case 4:{
				
				op.imprAg(dados);
				
				
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
