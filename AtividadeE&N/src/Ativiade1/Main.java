package Ativiade1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao op = new Operacao();
		String[] dado = new String[4];
		
		int casos=0, env=0, at=0;
		boolean c1 = true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar e verificar sua idade\n2 para ver a idade de Enisten e Newton\n3 pra sair"));
			
			switch(casos) {
			
			case 1:{
					
				dado[0] = JOptionPane.showInputDialog("Coloque seu nome");
				dado[1] = JOptionPane.showInputDialog("Coloque o dia atual");
				dado[2] = JOptionPane.showInputDialog("Coloque o mês atual");
				at = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ano de nascimento"));
				
				op.dados(dado, at, env);
					
			}
			
			case 2:{
				
				
				op.einsteinisaac();
				
				
			}
				
			default:{
				
				c1 = false;
				
				}

			}
							
		}while(c1 == true);
		
		
	}

}
