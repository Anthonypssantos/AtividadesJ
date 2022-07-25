package Atividade1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pagamentos pag = new Pagamentos();
		
		String casos;
			
		boolean c = true;
		
		do {
			
			casos = JOptionPane.showInputDialog("Metodos de pagamento a baixo\n============\nDinheiro\nCheque\nCartão\nDigite 'sacola' para ver a sua sacola\nDigite 'Sair' para sair\n============\nPara iniciar a compra siga o exemplo a baixo\nExemplo: Dinheiro para pagar em dinheiro e etc...");
			
			switch(casos) {
			
			case "Dinheiro":{
				
				pag.dinheiro();
				
				break;
			}
			
			case "Cheque":{
							
				pag.cheque();
				
				break;
			}
			
			case "Cartão":{
				
				pag.cartao();
				
				break;
			}
			
			case "sacola":{
					
				JOptionPane.showMessageDialog(null, "Sua sacola\n"+"Batata: "+pag.rb+"\nArroz: "+pag.ra+"\nFeijão: "+pag.rfj+"\nFrango: "+pag.rfg+"\nMate: "+pag.rm+"\nValor Total: "+pag.rt);
				
				break;
			}
			
			case "Sair":{
				
				c = false;
				
				break;
			}
					
			}
				
		}while(c == true);
	
	
	}

}
