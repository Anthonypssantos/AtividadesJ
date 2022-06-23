package oo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Operacoes op = new Operacoes();
		
		String sair;
		
		int casos=0, a=0, b=0, c=0;
		
		boolean c1=true;
		
		do {
			
		casos = Integer.parseInt(JOptionPane.showInputDialog("1 para somar\n2 para subtrair\n3 para dividir\n4 para multiplicar\n5 entrar no menu sair"));	
			
			switch(casos){
			
			case 1:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primerio numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero"));
				
				c = op.soma(a, b);
				
				JOptionPane.showMessageDialog(null, c);
				
				break;
			}
			
			case 2:{
							
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primerio numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero"));
				
				c = op.subtrair(a, b);
				
				JOptionPane.showMessageDialog(null, c);
				
				break;
			}
			
			case 3:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primerio numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero"));
				
				c = op.dividir(a, b);
				
				JOptionPane.showMessageDialog(null, c);
				
				break;
			}
			
			case 4:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primerio numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero"));
				
				c = op.multiplicar(a, b);
				
				JOptionPane.showMessageDialog(null, c);
				
				break;
			}
			
			default:{
				
					sair = JOptionPane.showInputDialog("Sair ou Não");
					
					if (sair.equals("Sair")) {
						
						c1 = false;
						
					}
				
				break;
				
				}	
			
			}
			
		}while(c1 == true);	
		
	}
}
