package Atividade;

import javax.swing.JOptionPane;

public class Main extends DadosAlunos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DadosAlunos DA = new DadosAlunos();
		
		String nome="", casos="";
		double nota1=0.0, nota2=0.0, trabalho=0.0;
		
		boolean c = true;
		
		
		do {
			
			casos = JOptionPane.showInputDialog("Digite 'adicionar' ou 'sair'");
			
			switch(casos) {
			
			case "adicionar":{
				 
				
				nome = JOptionPane.showInputDialog("Coloque seu nome");
				nota1 = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua nota da prova 1"));
				nota2 =	Double.parseDouble(JOptionPane.showInputDialog("Coloque sua nota da prova 2"));
				trabalho = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua nota do trabalho"));
				
				DA.setNome(nome);
				DA.setNota1(nota1);
				DA.setNota2(nota2);
				DA.setTrabalho(trabalho);
				
				DA.tudo();
				
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
