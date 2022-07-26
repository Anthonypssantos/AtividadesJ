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
		
		c = true;
		JOptionPane.showMessageDialog(null, "Você ira pagar em dinheiro\nLembrete: A compra é feita em kilo por alimento");
		produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);
		
		//faça
		while(c == true) {
			
			produtos="";
			rt = sb + sa + sfj + sfg + sm;
			produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);                                                        
			
			switch(produtos) {
			
			case "batata":{
				
				if(rb < 99) {
					
					rb++;		
					sb += batata;					
					pdt.setBatata(rb);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}		
				
				break;
				}
			
			case "arroz":{
				
				if(ra < 99) {
					
					ra++;
					sa += arroz;
					pdt.setArroz(ra);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
						
				}
				
				break;		
				
				}
			
			case "feijão":{
				
				if(rfj < 99) {
					
					rfj++;	
					sfj += feijao;
					pdt.setFeijao(rfj);
					
					
							
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}
				
				break;
				}
			
			case "frango":{
				
				if(rfg < 99) {
					
					rfg++;
					sfg += frango;
					pdt.setFrango(rfg);
					
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
				}
				
				break;
				}
			
			case "mate":{
				
				if(rm < 99) {
					
					rm++;
					sm += mate;
					pdt.setMate(rm);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}
				
				break;
				}
					
			case "pagar":{
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Você tem que pagar "+ rt + " Reais"));
				
				if(p > rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor acima do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					 sb = 0.0;
					 sa = 0.0;
					 sfj = 0.0;
					 sfg = 0.0;
					 sm = 0.0; 
					 rt = 0.0; 
					 p = 0.0;
					 rb=0;
					 ra=0;
					 rfj=0;
					 rfg=0;
					 rm=0;
					 c = false;
					 produtos = "";
					 
					break;
				}
				
				if(p < rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor a baixo do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					c = false;
					sb = 0.0;
					sa = 0.0;
					sfj = 0.0;
					sfg = 0.0;
					sm = 0.0; 
					rt = 0.0; 
					p = 0.0;
					rb=0;
					ra=0;
					rfj=0;
					rfg=0;
					rm=0;
					produtos="";
					
				}
				
				break;
			
			}
			
			default:{
				JOptionPane.showMessageDialog(null, "Obrigado por compra!");
				c=false;
				break;
			}
			
			}
		
		//final	
		}
			
	}
	
	//pagamento em cheque
	public void cheque() {
		
		c = true;
		JOptionPane.showMessageDialog(null, "Você ira pagar em dinheiro\nLembrete: A compra é feita em kilo por alimento");
		produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);
		
		//faça
		while(c == true) {
			
			produtos="";
			rt = sb + sa + sfj + sfg + sm;
			produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);                                                        
			
			switch(produtos) {
			
			case "batata":{
				
				if(rb < 99) {
					
					rb++;		
					sb += batata;					
					pdt.setBatata(rb);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}		
				
				break;
				}
			
			case "arroz":{
				
				if(ra < 99) {
					
					ra++;
					sa += arroz;
					pdt.setArroz(ra);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
						
				}
				
				break;		
				
				}
			
			case "feijão":{
				
				if(rfj < 99) {
					
					rfj++;	
					sfj += feijao;
					pdt.setFeijao(rfj);	
							
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}
				
				break;
				}
			
			case "frango":{
				
				if(rfg < 99) {
					
					rfg++;
					sfg += frango;
					pdt.setFrango(rfg);
						
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
				}
				
				break;
				}
			
			case "mate":{
				
				if(rm < 99) {
					
					rm++;
					sm += mate;
					pdt.setMate(rm);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}
				
				break;
				}
					
			case "pagar":{
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Você tem que pagar "+ rt + " Reais"));
				
				if(p > rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor acima do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					 sb = 0.0;
					 sa = 0.0;
					 sfj = 0.0;
					 sfg = 0.0;
					 sm = 0.0; 
					 rt = 0.0; 
					 p = 0.0;
					 rb=0;
					 ra=0;
					 rfj=0;
					 rfg=0;
					 rm=0;
					 c = false;
					 produtos = "";
					 
					break;
				}
				
				if(p < rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor a baixo do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					c = false;
					sb = 0.0;
					sa = 0.0;
					sfj = 0.0;
					sfg = 0.0;
					sm = 0.0; 
					rt = 0.0; 
					p = 0.0;
					rb=0;
					ra=0;
					rfj=0;
					rfg=0;
					rm=0;
					produtos="";
					
				}
				
				break;
			
			}
			
			default:{
				JOptionPane.showMessageDialog(null, "Obrigado por compra!");
				c=false;
				break;
			}
			
			}
		
		//final	
		}
			
	}
	
	//cartão
	public void cartao() {	
		
		c = true;
		JOptionPane.showMessageDialog(null, "Você ira pagar em dinheiro\nLembrete: A compra é feita em kilo por alimento");
		produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);
		
		//faça
		while(c == true) {
			
			produtos="";
			rt = sb + sa + sfj + sfg + sm;
			produtos = JOptionPane.showInputDialog("Tipo\n=========\nbatata\narroz\nfeijão\nfrango\nmate\n==========\nDigite 'parar' para voltar\nDigite 'pagar' para pagar os alimentos\n============\nSacola atual\nbatata: "+rb+ "\narroz: "+ra+"\nfeijão: "+rfj+"\nfrango: "+rfg+"\nmate: "+rm+"\n===========\nCustos\nBatata: "+sb+"\nArroz: "+sa+"\nFeijão: "+sfj+"\nFrango: "+sfg+"\nMate: "+sm+"\nValor total: "+ rt);                                                        
			
			switch(produtos) {
			
			case "batata":{
				
				if(rb < 99) {
					
					rb++;		
					sb += batata;					
					pdt.setBatata(rb);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}		
				
				break;
				}
			
			case "arroz":{
				
				if(ra < 99) {
					
					ra++;
					sa += arroz;
					pdt.setArroz(ra);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
						
				}
				
				break;		
				
				}
			
			case "feijão":{
				
				if(rfj < 99) {
					
					rfj++;	
					sfj += feijao;
					pdt.setFeijao(rfj);
					
					
							
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}
				
				break;
				}
			
			case "frango":{
				
				if(rfg < 99) {
					
					rfg++;
					sfg += frango;
					pdt.setFrango(rfg);	
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
				}
				
				break;
				}
			
			case "mate":{
				
				if(rm < 99) {
					
					rm++;
					sm += mate;
					pdt.setMate(rm);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Produto de estoque acabado");
					
				}
				
				break;
				}
					
			case "pagar":{
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Você tem que pagar "+ rt + " Reais"));
				
				if(p > rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor acima do preço dos alimentos");
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					 sb = 0.0;
					 sa = 0.0;
					 sfj = 0.0;
					 sfg = 0.0;
					 sm = 0.0; 
					 rt = 0.0; 
					 p = 0.0;
					 rb=0;
					 ra=0;
					 rfj=0;
					 rfg=0;
					 rm=0;
					 c = false;
					 produtos = "";
					 
					break;
				}
				
				if(p < rt) {
					
					JOptionPane.showMessageDialog(null, "Você pagou um valor a baixo do preço dos alimentos");
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Obrigado volte sempre");
					
					c = false;
					sb = 0.0;
					sa = 0.0;
					sfj = 0.0;
					sfg = 0.0;
					sm = 0.0; 
					rt = 0.0; 
					p = 0.0;
					rb=0;
					ra=0;
					rfj=0;
					rfg=0;
					rm=0;
					produtos="";
					
				}
				
				break;
			
			}
			
			default:{
				
				JOptionPane.showMessageDialog(null, "Obrigado por compra!");
				c=false;
				break;
			
			}
			
			}
		
		//final	
		}
		
	}
}

	

