package Pacote;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Gabarito {
	
	Main m = new Main();
	private String nots;

	ArrayList<String> certouerrad = new ArrayList<>();
	
	public String gabarito(int f) {	
		String vai=" ";
		
		JOptionPane.showMessageDialog(null, "Numero de acertos"+ f);
		
	for(int i = 0; i < certouerrad.size(); i++) {
			
			System.out.println(certouerrad.get(i));
				
		}
	
		for(int i = 0;i < certouerrad.size();i++) {
			
			vai = certouerrad.get(i);
			
		}
		
		return vai;
	}
	
	
public String getNots() {
	return nots;
	}

public void setNots(String nots) {
	this.nots = nots;
	
	certouerrad.add(nots);
	}	
	
}
