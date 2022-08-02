package Aividade4;

import javax.swing.JOptionPane;

public class prova extends Provareturna{
	
	Provareturna pvrta = new Provareturna();
	Gabarito gab = new Gabarito();
	
	String questao=" ", nome=" ";
	double nota=0.0, l=0.0;
	int casos=0, f=0, alunos=0;
	
	private int h=0;
	
	
	public int getH() {
		return h;
	
	}

	public void setH(int h) {
		this.h = h;
	}

	public void gabarito() {		
		
		gab.gabarit();
	
	}
	
	public void respostaAluno(){
			
			if(h == 1) {
				
				nome = JOptionPane.showInputDialog("Coloque seu nome");
				questao = JOptionPane.showInputDialog("Quem usa linux: \nA: Anthony\nB: Cristopher\nC: Paulo");
				
				if(questao.equals("A")) {
					f++;
					l = 0.5;
					
				}else {
					
					nota += 0.0;
					
				}
				
			}
			//Se h igual a 2 entra na primeira Segunda 
			else if(h == 2) {
				
				questao = JOptionPane.showInputDialog("Quem está a esquerda de Anthony\nA: Luiz\nB: Paulo\nC: Cristopher");
				
				if(questao.equals("A")) {
					f++;
					l += 0.5;
					
				}else {
					
					nota += 0.0;
					
				}
				
				
			}
			
			else if(h == 3) {
					
					questao = JOptionPane.showInputDialog("Quem é o professor da sala 305\nA: Mariano\nB: Luiz\nC: Mendigo");
					
					if(questao.equals("A")) {
						f++;
						l += 0.5;
						
					}else {
						
						nota += 0.0;
						
					}
					
				}
				
		else if(h == 4) {
			
			questao = JOptionPane.showInputDialog("Quem está trabalhando na mix da sala do mariano\nA: Victor\nB: arthur\nC: Cristopher");
			
			if(questao.equals("C")) {
				f++;
				l += 0.5;
				
			}else {
				
				nota += 0.0;
				
			}
			
		}
		
			
			
		else if(h == 5) {
			
			questao = JOptionPane.showInputDialog("Quem sempre tem uma bergamota na sala\nA: Arthur\nB: Anthony\nC: Anthony");
		
			if(questao.equals("A")) {
				f++;
				l += 0.5;
				acertos();
			}else {
				
				nota += 0.0;
				acertos();
			}
			
			
			}
				
	/*	else if(h == 6) {
			
			questao = JOptionPane.showInputDialog("Quando é 4+4\nA: 5\nB: 7\nC: 8");
		
			if(questao.equals("C")) {
				f++;
				l += 0.5;
				
			}else {
				
				nota += 0.0;
				
			}
				
		}
				
		else if(h == 7) {
			
			questao = JOptionPane.showInputDialog("Quem usa impresora 3d\nA: Luiz\nB: Arthur\nC: Mariano");
			
			if(questao.equals("A")) {
				f++;
				l += 0.5;
				
			}else {
				
				nota += 0.0;
				
			}
			
			
		}
				
		else if(h == 8) {
			
			questao = JOptionPane.showInputDialog("Quem é o mais alto da sala\nA: Anthony\nB: Paulo\nC: Victor");
			
			if(questao.equals("B")) {
				f++;
				l += 0.5;
				
			}else {
				
				nota += 0.0;
				
			}
			
			
		}
				
		else if(h == 9) {
			
			questao = JOptionPane.showInputDialog("Quanto é 5+5\nA: 5\nB: 1\nC: 10");
			//Se questão igual a "A" tipo String Variavel l recebe 0.5
			if(questao.equals("C")) {
				f++;
				l += 0.5;
				
			}else {
				
				nota += 0.0;
				
			}
				
		}
			
			else if(h == 10) {
					
					questao = JOptionPane.showInputDialog("Quanto é 6+6\nA: 5\nB: 1\nC: 12");
					//Se questão igual a "A" tipo String Variavel l recebe 0.5
					if(questao.equals("C")) {
						f++;
						l += 1.0;
						
					}else {
						
						nota += 0.0;
						
					}
						
				}
					
			else if(h == 11) {
				
				questao = JOptionPane.showInputDialog("Quanto é 7+7\nA: 5\nB: 1\nC: 14");
				//Se questão igual a "A" tipo String Variavel l recebe 0.5
				if(questao.equals("C")) {
					f++;
					l += 1.0;
					
				}else {
					
					nota += 0.0;
					
				}
					
			}
					
			else if(h == 12) {
				
				questao = JOptionPane.showInputDialog("Quanto é 8+8\nA: 5\nB: 1\nC: 16");
				//Se questão igual a "A" tipo String Variavel l recebe 0.5
				if(questao.equals("C")) {
					f++;
					l += 1.0;
					
				}else {
					
					nota += 0.0;
					
				}
					
			}
			else if(h == 13) {
				
				questao = JOptionPane.showInputDialog("Quanto é 9+9\nA: 5\nB: 1\nC: 18");
				//Se questão igual a "A" tipo String Variavel l recebe 0.5
				if(questao.equals("C")) {
					f++;
					l += 1.0;
					
				}else {
					
					nota += 0.0;
					
				}
					
			}
					
			else if(h == 14) {
				
				questao = JOptionPane.showInputDialog("Quanto é 10+10\nA: 5\nB: 1\nC: 20");
				//Se questão igual a "A" tipo String Variavel l recebe 0.5
				if(questao.equals("C")) {
					f++;
					l += 1.0;
					
				}else {
					
					nota += 0.0;
					
				}
					
			}
			
			else if(h == 15) {
				
				questao = JOptionPane.showInputDialog("Quanto é 15+15\nA: 5\nB: 1\nC: 30");
				//Se questão igual a "A" tipo String Variavel l recebe 0.5
				if(questao.equals("C")) {
					f++;
					l += 1.0;
					acertos();
				}else {
					
					nota += 0.0;
					acertos();
					
				}
					
			} */
		
		//final metodo resposta Aluno
		
	}	
		
	
	public void acertos() {
		
		JOptionPane.showMessageDialog(null,"Seus acertos: "+ f);
		
		nota();
		
	}
	
	public void nota() {
		
		JOptionPane.showMessageDialog(null,"Sua nota: "+ l);
		
		pvrta.setNome(nome);
		pvrta.setNota(l);
		
		maior();
		
	}
	
	public void maior() {
	
		pvrta.print();
		f = 0;
		l = 0.0;
	}
	
}