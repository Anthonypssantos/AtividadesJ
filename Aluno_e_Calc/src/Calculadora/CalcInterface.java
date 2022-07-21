package Calculadora;

import javax.swing.JOptionPane;

public class CalcInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaração da chamada
		CalcControle call = new CalcControle();
		
		//variaveis de chamada e inserção
		String f;
		
		int casos, h, r;
		
		boolean c1 = true;
		
		//estrutura de repetição
		do {
			//inserir caso 1 ou 2
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 'Calcular'\n2 'Sair'"));
			//casos
			switch(casos) {
			
				case 1:{
					//controla	
					f = JOptionPane.showInputDialog("Digite '+' para Somar\nDigite '-' para Subtrair\nDigite 'x' para Multiplicar\nDigite '/' para Dividir");
					
					call.recebe(f);
					call.getResult();
					
					break;
				}
				//sair
				default:{
					
					c1 = false;
					
					break;
				}
			
			}
			
		//final do while	
		}while(c1 == true);
			
	}

}
