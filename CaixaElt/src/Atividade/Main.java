package Atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacoes op = new Operacoes();	
		
		String nome;
		int casos=0, saldo=0, deposito=0;
		boolean c=true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para retirar\n2 para adicionar\n3 para visualizar\n4 para cadastrar o nome\n5 para sair"));
			
			switch(casos) {
			
			case 1:{
				saldo = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantia que desejas depostar"));
				op.setSaldo(saldo);
				
				break;
			}
			
			case 2:{
				
				deposito = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantia que desejas depostar"));
				op.setDeposito(deposito);
				
				break;
			}
			
			case 3:{
				
				op.getDeposito();
				
				break;
			}
			
			case 4:{
				nome = JOptionPane.showInputDialog("Coloque seu nome");
				op.cadastro(nome);
				
				break;
			}
			
			default:{
				c = false;
				break;
			}
			
			}
			
		}while(c == true);
		
		
	}

}
