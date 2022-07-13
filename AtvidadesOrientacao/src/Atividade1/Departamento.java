
package Atividade1;
import java.util.Random;
import javax.swing.JOptionPane;

public class Departamento {
	
	String nd;
	int depart;
	private int Departamento;

	public int getDepartamento() {
		
		JOptionPane.showMessageDialog(null, "Departamento escolhido: "+ nd);
		
		
		return Departamento;
	}

	public void setDepartamento(int depart) {
		Departamento = depart;
		
		if (Departamento >= 1 && Departamento <= 10) {
			
			nd = "Departamento1";
			
		}
		if (Departamento >= 11 && Departamento <= 20) {
					
			nd = "Departamento2";
					
		}
		if (Departamento >= 21 && Departamento <= 30) {
			
			nd = "Departamento3";
			
		}
		if (Departamento >= 31 && Departamento <= 40) {
			
			nd = "Departamento4";
			
		}
		if (Departamento >= 41 && Departamento <= 50) {
			
			nd = "Departamento5";
			
		}
		
	
	}
	
}
