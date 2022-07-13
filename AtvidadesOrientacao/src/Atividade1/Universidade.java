package Atividade1;

import javax.swing.JOptionPane;

public class Universidade {
	
	Departamento dep = new Departamento();
	
	private String Universidade;

	public String getUniversidade() {
		
		
		JOptionPane.showMessageDialog(null, "Universidade atual: "+Universidade);
		
		return Universidade;
	}

	public void setUniversidade(String universidade) {	
			Universidade = universidade;
	
			
	}
	
}
