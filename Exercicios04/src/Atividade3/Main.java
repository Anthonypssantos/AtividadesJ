package Atividade3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacao op = new Operacao();
		int capacidade = 0 , rc = 0, r=0;
		int a = 0;
		boolean c1=true;
		int casos=0;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para Adicionar alguma pessoa\n2 para sair do elevador\n3 para Subir\n4 para descer"));
			
			switch(casos) {
			
			case 1:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero de pessoas que desejas adicionar no elevador\nAviso! no maximo 5"));
				
				op.painel(a, rc);
				
				break;
			}
			
			case 2:{
				
				c1 = false;
				
				break;
			}
			
			case 3:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o andar que deseja subir\n5 andares no total"));
				
				op.subir(a);
				
				break;
			}
			
			case 4:{
				
				r = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque o andar que deseja descer\n5 andares no total"));
				
				op.descer(r);
				
				break;
			}
			
			}
			
		}while(c1 == true);
		
	}

}
