package Calculadora;

import javax.swing.JOptionPane;

public class CalcControle {

	private double result;
	
	String tipo;
	
	double op1, op2;
	
	public double getResult() {
		
		JOptionPane.showMessageDialog(null, result);
		
		return result;
	}

	public void setResult(double result) {
		double op1, op2;
		
		if(tipo.equals("+")) {
			
			op1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero")); 
			op2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero")); 
				
			this.result = op1 + op2;
			
		}
		
		if(tipo.equals("-")) {
					
					op1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero")); 
					op2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero")); 
						
					this.result = op1 - op2;
					
				}
		
		if(tipo.equals("x")) {
			
			op1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero")); 
			op2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero")); 
				
			this.result = op1 * op2;
			
		}
		
		if(tipo.equals("/")) {
			
			op1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero")); 
			op2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero")); 
				
			this.result = op1 / op2;
			
		}
		
	}
	
	public void recebe(String f) {
	
	tipo = f;
	
	setResult(result);
	
	}
	
}
