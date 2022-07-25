package Atividade1;

import javax.swing.JOptionPane;

public class Pagamentos extends Produtos{
		
	Produtos pdt = new Produtos();
	
	 Double batata = 8.15, arroz = 5.10, feijao = 4.75, frango = 10.50, mate = 8.0;
	 Double sb = 0.0, sa = 0.0, sfj = 0.0, sfg = 0.0, sm = 0.0, rt = 0.0, p = 0.0;
	 int rb=0, ra=0, rfj=0, rfg=0, rm=0;
	 String produtos="";
	 boolean c = true;
	  
	//dinheiro 
	public void dinheiro() {

		JOptionPane.showMessageDialog(null, "Você ira pagar em dinheiro\nLembrete: A compra é feita em kilo por alimento");
			
		//faça
		do {
			rt = sb + sa + sfj + sfg + sm;
			produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);                                                        
			
			switch(produtos) {
			
			case "batata":{
				
				if(rb > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rb++;	
					
					sb += batata;
					
					pdt.setBatata(rb);
					
				}		
				
				break;
				}
			
			case "arroz":{
				
				if(ra > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
				
					ra++;
					sa += arroz;
					pdt.setArroz(ra);	
				}
				
				break;			
				}
			
			case "feijão":{
				
				if(rfj > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
							
				}else {
					
					rfj++;	
					sfj += feijao;
					pdt.setFeijao(rfj);
				}
				
				break;
				}
			
			case "frango":{
				
				if(rfg > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rfg++;
					sfg += frango;
					pdt.setFrango(rfg);
				}
				
				break;
				}
			
			case "mate":{
				
				if(rm > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rm++;
					sm += mate;
					pdt.setMate(rm);
				}
				
				break;
				}
			
			case "parar":{
				
				if(p == 0) {
					
					JOptionPane.showMessageDialog(null, "Você será preso por furto");
					
					
				}else {
					
					c = false;
					
				}
				
				break;
				}
			
			case "pagar":{
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Você tem que pagar "+ rt + " Reais"));
				
				if(p > rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor acima do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					c = false;
					
					break;
				}
				
				if(p < rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor a baixo do preço dos alimentos");
					
					
				}else {
					
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					c = false;
					
					
					break;
				}
				
				
				break;
			
			}
			
			}
		
		//final	
		}while(c == true);
			
	}
	//pagamento em cheque
	public void cheque() {
		
		JOptionPane.showMessageDialog(null, "Você ira pagar em cheque\nLembrete: A compra é feita em kilo por alimento");
		//faça
		do {
			rt = sb + sa + sfj + sfg + sm;
			produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);                                                        
			
			
			switch(produtos) {
			
			case "batata":{
				
				if(rb > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rb++;	
					
					sb += batata;
					
					pdt.setBatata(rb);
					
				}		
				
				
				break;
				}
			
			case "arroz":{
					
				if(ra > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
				
					ra++;
					sa += arroz;
					pdt.setArroz(ra);	
				}
				
				break;			
				}
			
			case "feijão":{
				
				if(rfj > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
							
				}else {
					
					rfj++;	
					sfj += feijao;
					pdt.setFeijao(rfj);
				}
				
				break;
				}
			
			case "frango":{
				
				if(rfg > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rfg++;
					sfg += frango;
					pdt.setFrango(rfg);
				}
				
				break;
				}
			
			case "mate":{
				
				if(rm > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rm++;
					sm += mate;
					pdt.setMate(rm);
				}
				
				break;
				}
			
			case "parar":{
				
				if(p == 0) {
					
					JOptionPane.showMessageDialog(null, "Você será preso por tentativa de furto");
						
					
				}else {
					
					c = false;
							
				}
				
				break;
				}
			
			
		case "pagar":{
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Você tem que pagar "+ rt + " Reais"));
				
				if(p > rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor acima do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					c = false;
					
					break;
				}
				
				if(p < rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor a baixo do preço dos alimentos");
					
					
				}else {
					
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					c = false;
					
					
					break;
				}
				
				
				break;
			
			}
			
			}
		
		//final	
		}while(c == true);
			
	}
	//cartão
	public void cartao() {	
		
		JOptionPane.showMessageDialog(null, "Você ira pagar em cartão\nLembrete: A compra é feita em kilo por alimento");
		//faça
		do {
			
			rt = sb + sa + sfj + sfg + sm;
			produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);                                                        
			
			switch(produtos) {
			
			case "batata":{
				
				if(rb > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rb++;	
					
					sb += batata;
					
					pdt.setBatata(rb);
					
				}		
				
				break;
				}
			
			case "arroz":{
				
				if(ra > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
				
					ra++;
					sa += arroz;
					pdt.setArroz(ra);	
				}
				
				break;			
				}
			
			case "feijão":{
				
				if(rfj > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
							
				}else {
					
					rfj++;	
					sfj += feijao;
					pdt.setFeijao(rfj);
				}
				
				break;
				}
			
			case "frango":{
				
				if(rfg > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rfg++;
					sfg += frango;
					pdt.setFrango(rfg);
				}
				
				break;
				}
			
			case "mate":{
				
				if(rm > 49) {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}else {
					
					rm++;
					sm += mate;
					pdt.setMate(rm);
				}
				
				break;
				}
			
			case "parar":{
				
				if(p == 0) {
					
					JOptionPane.showMessageDialog(null, "Você será preso por tentativa de furto");
						
					
				}else {
					
					c = false;
					
				}
				
				break;
				}
			
			
		case "pagar":{
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Você tem que pagar "+ rt + " Reais"));
				
				if(p > rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor acima do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					c = false;
					
					break;
				}
				
				if(p < rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor a baixo do preço dos alimentos");
					
					
				}else {
					
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					c = false;
					
					
					break;
				}
				
				
				break;
			
			}
			
			}	
		//final	
		}while(c == true);
		
	}
	
}
