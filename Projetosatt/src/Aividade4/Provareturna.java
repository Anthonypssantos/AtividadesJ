package Aividade4;

import javax.swing.JOptionPane;

public class Provareturna {
	
	private double nota=0.0;
	
	
	public void print() {
		
		if(nota < 7.5) {
			
			JOptionPane.showMessageDialog(null,"Sua nota é: "+ this.nota+ "\n======\nNota baixa");
			
		}else {
			
			JOptionPane.showMessageDialog(null,"Sua nota é: "+ this.nota+ "\n======\nNota Alta");
			
		}
		
	}
		
	public double getNota() {
				
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
			
	}
	
}
