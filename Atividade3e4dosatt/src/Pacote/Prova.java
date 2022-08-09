package Pacote;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
public class Prova {
	
	
	
	//inicio das variaves
			//==================================
			
			//chamdas das classes
			
			Provaealuno pv = new Provaealuno();
			Gabarito gab = new Gabarito();
			
			//vetor setado
			String[] perguntas = {"Paulo é grande?Sim ou não","Cristopher trabalha na mix?Sim ou não","Arthur gosta de bergamota?Sim ou não","Victor tem bigode?Sim ou não","Anthony usa linux?Sim ou não","Mariano usa um notbook da 'DELL'?Sim ou não","Mariano da aula na sala 305?Sim ou não"," Luiz tem um impressora 3d?Sim ou não ","Anthony gosta de monster?Sim ou não","Você está no senac agora?Sim ou não"," Você é um ser humano?Sim ou não ","Mariano tem garrafa de agua?Sim ou não ","O cristopher desliga a tv da sala com o celular?Sim ou não","Anthony gosta de linux?Sim ou não","O nascional fica a direita da saida da frente do senac?Sim ou não"}; 
			ArrayList<Double> notas = new ArrayList<>();
			
			Random aleatorio = new Random();
			
			//strings
			String nome=" ", entrar=" ", b=" ";
			
			//variaveis de incremento
			int r=0, f=0, n=0, recb=0, q=0, rand=0;
			
			int max = 15;
		    int min = 1;
		    int range = max - min + 1;
			
			//estrutura de repetição
			boolean v = true;
			
			//a nota
			double nota=0.0, not=0.0;
		    
		    //=================================
		    //final das variaveis
		    
			public int aluno(int total) {
				
				for(int i = 0; i < total; i++) {
					
				nome = JOptionPane.showInputDialog("Coloque o nome do aluno");
				
				JOptionPane.showMessageDialog(null, nome);
				
				pv.setNom(nome);
				
				}
				
				return total;
			
			}
			
			public String addnota(int alunos) {
				String questao=" ", certos=" ", vai=" ";
				
				do {
					
					if(alunos == 0) {
						
						JOptionPane.showMessageDialog(null, "Coloque alunos para conseguir proceguir");
						
						
					}else {
						
						for (int i = 0; i < 15; i++) {
							
				           rand = aleatorio.nextInt(15);
				           
				         }
						
						entrar = JOptionPane.showInputDialog("Para inicar a prova digite 'prova'\nPara sair digite 'sair'");
						n++;
					
					}
									
					switch(entrar) {
					
					//prova
					case "prova":{
						
						questao = JOptionPane.showInputDialog(perguntas[rand]);
						
						if(questao.equals("Sim")) {
							f++;	
								if(n < 10) {
									
									nota += 0.5;
									gab.setNots("Certo");
									
								}else {
									
									nota += 0.5;
									
								}							
													
							}else if(questao.equals("sim")) {
								f++;
									if(n >= 10) {
										
										nota ++;
										
										
									}else {
										
										nota ++;
										
									}
								
								gab.setNots("Certo");	
								
							}else {
								
								gab.setNots("errado");	
					
							}
							
						if(n == 2) {
							n = 0;
							q++;
								
								JOptionPane.showMessageDialog(null, "Total de respostas preenchidas "+f+" Prova aluno"+ q);
								pv.setNota(nota);
								
							nota = 0.0;
							
							
							if(q == alunos) {
								
								JOptionPane.showMessageDialog(null, "O limite de provas feitas pelos alunos chegou ao fim");
								
								pv.print();
								
								vai = gaba(f);
							}

						}
						
						break;
					}		
						
					//saida
					
					default:{
						
						v = false;
						
						break;
						}
					
					}
				//final da estrutura de repetição
				}while(v == true);
			return vai;
			}
			
			public String gaba(int f) {
				String vai=" ";
				
			vai = gab.gabarito(f);
				
				return vai;
			}	

}
