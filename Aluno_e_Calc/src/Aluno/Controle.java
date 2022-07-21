package Aluno;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controle {
	
	ArrayList<String> nomes= new ArrayList<>();
	String compara;
	String nome;
	private int p_ou_n;
	

	public String getNome() {
		
		return nome;
	}

	
	public void setNome(ArrayList<String> recebe) {
		
		
		for (int i = 0; i < 1; i++) {
			
			JOptionPane.showMessageDialog(null, "Nomes cadastrados: "+"\n"+recebe.toString());

		}	
		
		
	}
	
	//passou ou não?
	public int getP_ou_n() {
		
		JOptionPane.showMessageDialog(null, "Nota final: "+ p_ou_n+" "+compara);
		
		return p_ou_n;
	}

	public void setP_ou_n(int p_ou_n) {
		this.p_ou_n = p_ou_n;
		
		if(p_ou_n > 1 && p_ou_n <= 50) {
			
			compara = "Reprovado";
			
		}
		
		if(p_ou_n > 50 && p_ou_n <= 100) {
			
			compara = "Aprovado";
			
		}
		
	}
	
	
	
	
}
