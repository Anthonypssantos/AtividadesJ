package Atividade;

import javax.swing.JOptionPane;

public class Main{

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		//puxar e inicializar
		
		Aluno al = new Aluno();
		Pessoa pes = new Pessoa();
		mostraDados md = new mostraDados();
		
		boolean c = true;
		
		String casos;
		
		do {
			
			casos = JOptionPane.showInputDialog("Você desejas se cadastrar como pessoa ou aluno?\nEscreva 'Pessoa' ou 'Aluno' para adicionar\nEscreva 'DadosA' ou 'DadosP' para mostrar os dados\nPara cancelar o codigo digite 'sair'");
			
			switch(casos) {

			case "Aluno":{
				
				al.alun();
				
				break;
				}
			
			case "Pessoa":{
				
				al.pesso();
				
				break;
			}
			
			case "DadosP":{
				
				al.mostraDados1();
				
				break;
			}
			
			case "DadosA":{
				
				al.mostraDados2();
				
				break;
			}
			
			default:{
				
				c = false;
				
				break;
			}
			
			
			}
				
		}while(c == true);
		
		
		
		
	}

}
