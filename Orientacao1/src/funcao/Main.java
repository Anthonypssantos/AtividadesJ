package funcao;

import javax.swing.JOptionPane;

public class Main {
	
	public static int divisao(int a, int b) {
		int div=0;
		
		div = a / b;
		
		return div;
	}
	
	public static int multiplicar(int a, int b) {
		int mult=0;
		
		mult = a * b;
		
		return mult;
	}
	
	public static int soma(int a, int b) {
		int somar=0;
		
		somar = a + b;
		
		return somar;
	}
	
	public static int subtrair(int a, int b) {
		int subtra=0;
		
		subtra = a - b;
		
		return subtra;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int casos=0, a=0, b=0, somar=0, subtra=0, mult=0, div=0;
		boolean c1=true;
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para Somar\n2 para Subtrair\n3 para Multiplicar\n4 Dividir\n5 para Sair"));
			
			switch(casos) {
				
			case 1:{
				
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				
				somar = soma(a,b);
				
				JOptionPane.showMessageDialog(null, "Soma: "+ somar);
				
				break;
			}
			
			case 2:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				
				subtra = subtrair(a,b);
				
				JOptionPane.showMessageDialog(null, "Subtração: "+ subtra);
				
				
				break;
			}
			
			case 3:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				
				mult = multiplicar(a,b);
				
				JOptionPane.showMessageDialog(null, "Multiplicação: "+ mult);
				
				break;
			}
			
			case 4:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero!"));
				
				div = divisao(a,b);
				
				JOptionPane.showMessageDialog(null, "Divisão: "+ div);
				
				break;
			}
			
			case 5:{
				
			c1 = false;	
			
			break;	
			}
			
			
			}
			
		}while(c1 == true);
		
		
		
	}
}
