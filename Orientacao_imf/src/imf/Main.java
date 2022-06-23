package imf;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		imfop op = new imfop();
		
		double r, peso, altura;
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu peso!"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua altura!"));
		
		r = op.imc(peso, altura);
		
		if (r < 16.0) {
			
			JOptionPane.showMessageDialog(null, "Magreza critica");
			
		}
		
		if (r >= 16.1 && r <= 20.0) {
			
			JOptionPane.showMessageDialog(null, "Magreza moderada");
			
		} 
		
		if (r >= 20.1 && r <= 25.0) {
			
			JOptionPane.showMessageDialog(null, "Saudavel");
			
		}
		if (r >= 25.1 && r <= 30.0) {
			
			JOptionPane.showMessageDialog(null, "Sobrepeso");
			
		}
		
		if (r >= 30.1 && r <= 35.0) {
			
			JOptionPane.showMessageDialog(null, "Obesidade grau 1");
			
		}		
		
		if (r >= 35.1 && r <= 39.9) {
					
			JOptionPane.showMessageDialog(null, "Obesidade grau 2");
					
		}		
		
		if (r >= 40.0) {
			
			JOptionPane.showMessageDialog(null, "Obesidade grau 3 (Critico!)");
			
		}		
		
	}
}
