package funcao1;

import javax.swing.JOptionPane;

public class Main {
	
	public static void cadastro() {
		
		String[] n = new String[300];
		int[] id = new int[300];
		double[] al = new double[300];
		
		String nome, rn;
		double altura, ral;
		int idade=0, rid=0, tam=0;
		
		tam = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas pessoas desejas cadastrar"));
		
		for (int i=0; i < tam; i++) {
			
			nome = JOptionPane.showInputDialog("Coloque nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque a idade"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Coloque o tamanho Ex: 1.80"));
			
			n[i] = nome;
			id[i] = idade;
			al[i] = altura;
			
			
			
		}
		
		for (int i=0; i < tam ; i++) {
			
			System.out.println("Nome "+ n[i]+ " idade "+id[i]+" altura "+al[i]+"\n");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cadastro();
		
	}
}
