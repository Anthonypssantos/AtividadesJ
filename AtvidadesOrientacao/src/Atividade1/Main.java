
package Atividade1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random aleatorio = new Random();
		Departamento departamento = new Departamento();
		Pessoa pessoa = new Pessoa();
		Universidade universidade = new Universidade();
		boolean c =true;
		int casos=0;
		String Pessoa, Universidade, Albert = "Albert Einsten", Isaac = "Isaac Newton";	
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para cadastrar seu nome\n2 para ver seus dados\n3 para escolher a sua universidade\n4 para para printar Newton e Isaac\n6 para sair"));
			
			switch(casos) {
			//cadastra nome
			case 1:{
				
				Pessoa = JOptionPane.showInputDialog("Coloque seu nome para cadastrar");
				pessoa.setPessoa(Pessoa);
						
				break;
			
			}
			
			//ver os dados
			case 2:{
				
			pessoa.getPessoa();
			universidade.getUniversidade();	
			departamento.getDepartamento();
				break;
			}
			
			
			//Albert Newton
			case 3:{
				
				Universidade = JOptionPane.showInputDialog("Desejas entrar na Universidade de Cambrige ou Nova Jersey?"); 
				universidade.setUniversidade(Universidade);
				
				int depart = aleatorio.nextInt(50);
				departamento.setDepartamento(depart);	
				
				break;
				}
			
			case 4:{
				
				pessoa.genios();
				
				break;
			}
			
			//sair
			default:{
				c = false;
				break;
				}
			
			}
			
		}while(c == true);	
		
	}

}
