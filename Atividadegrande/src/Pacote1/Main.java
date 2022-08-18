package Pacote1;

import javax.swing.JOptionPane;

import Pacote2.FaturaTeste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fatura f = new fatura();
		FaturaTeste ft = new FaturaTeste();
		
		boolean v = true;
		
		int casos=0, quantidade=0;
		
		String descricao="";
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para entrar na loja tecnica\n2 para ver o total\n3 para a FaturaTeste\n4 para sair"));
			
			switch(casos) {
			
			case 1:{
				
				descricao = JOptionPane.showInputDialog("Descrição das categorias de produtos\nFerramentas\nHardwares");	
				
			if(descricao.equals("Hardwares")) {	
					
					descricao = JOptionPane.showInputDialog("Você está no setor de Hardware\nSeguintes Hardwares para compra\nFonte: 190\nProcessador: 1200\nPlaca mãe: 400\nPlaca de video: 900\n\nDigite 'sair' para sair");
					
					if(descricao.equals("sair")) {
						JOptionPane.showMessageDialog(null, "Você acaba de sair do setor de hardware");
						return;	
						
						}else if(descricao.equals("Fonte")) {	
							quantidade=0;
							quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas fontes desejas levar?"));
							
							if(quantidade == 0) {							
								JOptionPane.showMessageDialog(null, "Oops! não samos pobres");
								
								}else {	
									Double envia;
									
									envia = 190.0 * quantidade;
									
									f.setPreco(envia);							
									f.setQuantidade(quantidade);
									}
							
							}else if(descricao.equals("Processador")) {
								quantidade=0;
								quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas processadores desejas levar?"));
								
								if(quantidade == 0) {				
									JOptionPane.showMessageDialog(null, "Oops! não samos pobres");				
									}else {
										Double envia;
										
										envia = 1200.0 * quantidade;
										
										f.setPreco(envia);	
										f.setQuantidade(quantidade);
										}
								
								}else if(descricao.equals("Placa mãe")) {
									quantidade=0;
									quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Placas Mãe desejas levar?"));
									
									if(quantidade == 0) {										
										JOptionPane.showMessageDialog(null, "Oops! não samos pobres");									
										}else {	
											Double envia;
											
											envia = 400.0 * quantidade;
											
											f.setPreco(envia);
											f.setQuantidade(quantidade);
											}
									
									}else if(descricao.equals("Placa de video")) {
										quantidade=0;
										quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Placas de videos desejas levar?"));
										
										if(quantidade == 0) {										
											JOptionPane.showMessageDialog(null, "Oops! não samos pobres");		
											}else {	
												Double envia;
												
												envia = 900.0 * quantidade;
												
												f.setPreco(envia);
												f.setQuantidade(quantidade);
												}	
										
										}else {
											
											JOptionPane.showMessageDialog(null, "Nome do Hardware digitado errado");
										}
							
				}else if(descricao.equals("Ferramentas")) {	
					
					descricao = JOptionPane.showInputDialog("Você está no setor de Ferramentas\nSeguintes Hardwares para compra\nChaveF: 20\nPasta termica: 100\nMartelo: 19\nCerra: 40\n\nDigite 'sair' para sair");
					
					if(descricao.equals("sair")) {
						JOptionPane.showMessageDialog(null, "Você acaba de sair do setor de hardware");
						return;	
						
						}else if(descricao.equals("ChaveF")) {
							quantidade=0;
							quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Chaves de Fenda desejas levar?"));
							
							if(quantidade == 0) {										
								JOptionPane.showMessageDialog(null, "Oops! não samos pobres");		
								}else {	
									Double envia;
																	
									envia = 20.0 * quantidade;
									
									f.setPreco(envia);	
									f.setQuantidade(quantidade);
									}

							}else if(descricao.equals("Pasta termica")) {
								quantidade=0;
								quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Pastas termicas desejas levar?"));
								
								if(quantidade == 0) {										
									JOptionPane.showMessageDialog(null, "Oops! não samos pobres");		
									}else {	
										Double envia;

										envia = 100.0 * quantidade;
		
										f.setPreco(envia);
										f.setQuantidade(quantidade);
										}

								}else if(descricao.equals("Martelo")) {
									quantidade=0;
									quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos Martelos desejas levar?"));
									
									if(quantidade == 0) {										
										JOptionPane.showMessageDialog(null, "Oops! não samos pobres");		
										}else {	
											Double envia;
			
											envia = 19.0 * quantidade;
		
											f.setPreco(envia);
											f.setQuantidade(quantidade);
											}

									}else if(descricao.equals("Cerra")) {
										quantidade=0;
										quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Cerras desejas levar?"));
										
										if(quantidade == 0) {										
											JOptionPane.showMessageDialog(null, "Oops! não samos pobres");		
											}else {
												Double envia;
									
												envia = 40.0 * quantidade;
							
												f.setPreco(envia);
												f.setQuantidade(quantidade);
												}
			
										}else {
											
											JOptionPane.showMessageDialog(null, "Nome da Ferramenta digitada errado");
										}
					
					}else {
					
					JOptionPane.showMessageDialog(null, "Oops! algo de errado não está certo.\nPor-favor escreva como está exatamente o nome da descrição");			
						
					}
				
				break;
				}
			
			case 2:{
				Double recebe=0.0;
				
				recebe = f.getPreco();
				
				JOptionPane.showMessageDialog(null, "Total: "+ recebe);
				
				break;
				}
			
			case 3:{
				Double vaipreco=0.0;
				int vaiquantidade=0;
				
				vaipreco = f.getPreco();
				vaiquantidade = f.getQuantidade();
				
				ft.quantidadepreco(vaiquantidade, vaipreco);
				
				break;
				}
			
			default:{
				v = false;
				break;
				}
			
			}
			
		}while(v == true);
		
	}

}
