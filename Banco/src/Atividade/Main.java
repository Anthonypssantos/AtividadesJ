package Atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Funcionario Finc = new Funcionario();
		
		boolean c = true;
		
		String nome, cpf, casos,matricula, adm;
		Double salario=0.0;
		Double desconto=0.0;
	
		do {
		
			
			casos = JOptionPane.showInputDialog("Escreva 'addfuncionario' para adicionar um funcionario\nEscreva 'aumento' para acrescentar um aumento\nEscreva 'ganhoanualbruto' para ver o seu Ganho Anual\nEscreva 'ganholiquidomensal' para ver seu Ganho Liquido Mensal\nEscreva 'imposto' para ver seu imposto\nEscreva 'ganholiquidoanual' para ver seu Ganho Liquido Anual\nEscreva 'dados' para ver seus dados pessoas Exemplo: Nome, salario e etc...\nEscreva 'sair' para sair do programa");
			
			switch(casos) {
			
			case "addfuncionario":{
				
				//nome = JOptionPane.showInputDialog("Coloque seu nome");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu salario"));
				//cpf = JOptionPane.showInputDialog("Coloque seu nome");
				adm = JOptionPane.showInputDialog("Data de admissão");
				matricula = JOptionPane.showInputDialog("Matricula");
				
				if(salario <= 2500.0) {
					
					
					desconto = salario * 0.11;
					
					salario -= desconto;
						
				}
				if(salario > 2500.0) {
					
					salario = (salario * 0.11 * 17.5) - salario;
					
				}
				
				//Finc.setNome(nome);
				//Finc.setCpf(cpf);
				//Finc.setMatricula(matricula);
				Finc.setSalario(salario);
				//Finc.setAddms(adm);
				
				break;
				}
			
			case "aumento":{
									
				Finc.aumento();
							
				break;
				}
			
			case "ganhoanualbruto":{
				
				Finc.gba();
				
				break;
				}
			
			case "ganhogliquidogmensal":{
				
				Finc.cglm();
				
				break;
				}
			
			case "imposto":{
				
				
				
				break;
				}
			
			case "ganholiquidoanual":{
				
				Finc.cgla();
				
				break;
				}
			
			case "dados":{
				
				Finc.dados();
				
				break;
			}
			
			case "sair":{
				
				c = false;
				
				break;
			}
			
			
			
			}
			
		}while(c == true);
			
	}

}
