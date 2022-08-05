package Aividade4;

import java.lang.Math;
import javax.swing.JOptionPane;

public class prova extends Provareturna{
	
	Provareturna pvrta = new Provareturna();
	Gabarito gab = new Gabarito();
	
	String[] perguntas = {"Paulo é grande?Sim ou não","Cristopher trabalha na mix?Sim ou não","Arthur gosta de bergamota?Sim ou não","Victor tem bigode?Sim ou não","Anthony usa linux?Sim ou não","Mariano usa um notbook da 'DELL'?Sim ou não","Mariano da aula na sala 305?Sim ou não"," Luiz tem um impressora 3d?Sim ou não ","Anthony gosta de monster?Sim ou não","Você está no senac agora?Sim ou não"," Você é um ser humano?Sim ou não ","Mariano tem garrafa de agua?Sim ou não ","O cristopher desliga a tv da sala com o celular?Sim ou não","Anthony gosta de linux?Sim ou não","O nascional fica a direita da saida da frente do senac?Sim ou não"}; 
	
	String recebe=" ", nome=" ", entrar=" ", questao=" ";
	
	int rtotal=0, ctotal=0;
	
	int r=0, f=0;
	
	boolean v = true;
	
	double nota=0.0;
    
	int max = 15;
    int min = 1;
    int range = max - min + 1;
    
	public int aluno(int total) {
		int f=0;
		
		for(int i =0; i < total; i++) {
			
		nome = JOptionPane.showInputDialog("Colopque o nome do aluno");
		pvrta.setNome(nome);
		
		}
		rtotal = total;
		
		return f;
	}
	
	public void addnota() {
		double notas=0.0;
		int h=0;
		
		do {
			
			entrar = JOptionPane.showInputDialog("Para inicar a prova digite 'prova'\nPara sair digite 'sair'");
			
			switch(entrar) {
			
			case "prova":{
				int rand=0;
				ctotal++;
				
				if(ctotal > rtotal) {
					
					JOptionPane.showMessageDialog(null, "Numero maximo de alunos");
					v = false;
					
				}
				
				 for (int i = 0; i < 15; i++) {
					 
				        rand = (int)(Math.random() * range) + min;	        
				        
				 }
				
				for(int i = 0; i < 15; i++) {
					r++;
					
					if(r < 10) {
						
						questao = JOptionPane.showInputDialog(perguntas[i]);
						
						if(questao.equals("Sim")) {
							f++;
							nota += 0.5;
							pvrta.setNota(nota);
						}
						if(questao.equals("sim")) {
							f++;
							nota += 0.5;
							pvrta.setNota(nota);
							
						}else {
							
							nota += 0.0;
							
						}
						
					}
					if(r >= 10) {
						
						questao = JOptionPane.showInputDialog(perguntas[i]);
						
						if(questao.equals("Sim")) {
							f++;
							nota += 1.0;
							pvrta.setNota(nota);
						}
						if(questao.equals("sim")) {
							f++;
							nota += 1.0;
							pvrta.setNota(nota);
						}else {
							
							nota += 0.0;
							
						}
						if(ctotal == rtotal ) {
							
							acertos(f);
							
						}
						
					}
						
					if(questao.equals("sair")) {
						pvrta.setNota(nota);
						v = false;
						
					}
					
				}
				
				break;
			}
					
			default:{
				
				v = false;
				break;
			}	
			
			}
		
		}while(v == true);
		
	}
	
	public void acertos(int f) {
		int a=0, lkj=0;
		
		a = f;
		
		JOptionPane.showMessageDialog(null, "Acertos da turma: "+a);
		
		nota(lkj);
		
	}
	
	public void nota(int not) {
		
		pvrta.print();
		
		
	}
	
	public void gabarito() {
		
		gab.gabarit();
		
	}		
	
}