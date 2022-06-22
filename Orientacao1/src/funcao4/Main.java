package funcao4;

import javax.swing.JOptionPane;

public class Main {

	public static void imcs(double peso, double altura) {
	double imc;
		
	imc = (peso * altura)/2;
	
	if (imc < 16.0) {
		
		JOptionPane.showMessageDialog(null, "Magreza grave");
		
		}
	if (imc >= 16.1 && imc <= 17.0) {
			
		JOptionPane.showMessageDialog(null, "Magreza moderada");
			
		}
	
	if (imc >= 17.1 && imc <= 18.5) {
		
		JOptionPane.showMessageDialog(null, "Magreza leve");
		
		
		}
	
	if (imc >= 18.6 && imc <= 25.0) {
		
		JOptionPane.showMessageDialog(null, "saudavel");
		
		}
	
	if (imc >= 25.1 && imc <= 30.0) {
		
		JOptionPane.showMessageDialog(null, "Sobrepeso");
		
		}
	
	if (imc >= 30.1 && imc <= 35.0) {
		
		JOptionPane.showMessageDialog(null, "Obesidade grau 1");
		
		}
	
	if (imc >= 35.1 && imc <= 40.0 ) {
		
		JOptionPane.showMessageDialog(null, "Obesidade grau 2(Severa)");
		
		}
	
	if (imc > 40.0) {
		
		JOptionPane.showMessageDialog(null, "Obesidade grau 3(Morbida)");
		
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double imc, peso, altura;
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua altura"));
		
		imcs(peso, altura);
		
	}
}
