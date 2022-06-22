package funcao2;

import javax.swing.JOptionPane;

public class Main {

	public static int US(int a) {
		int conversao1=0;
		
		conversao1 = a * 5;
		
		return conversao1;
	}
	
	public static int JP(int a) {
		int conversao2=0;
		
		conversao2 = a * 30;
		
		return conversao2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int conversao1=0, conversao2=0, casos=0, a=0;
		boolean c1=true;
		
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 converter para US\n2 converter para Japão\n3 para sair"));
			
			switch (casos) {
			
			case 1:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque um valor inteiro em real"));
				
				conversao1 = US(a);
				
				JOptionPane.showMessageDialog(null, "US "+ conversao1);
				
				break;
			}
			
			case 2:{
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Coloque um valor inteiro em real"));
				
				conversao2 = JP(a);
				
				JOptionPane.showMessageDialog(null, "JP "+ conversao2);
				
				
				break;
			}
			
			case 3:{
				c1 =false;
				break;
			}
			
			
			}
			
			
		}while(c1 == true);
		
		
		
	}

}
