package Pacote;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Gabarito {
	
	private String nots;

	ArrayList<String> certouerrad = new ArrayList<>();
	
	public void gabarito(int f) {	
		
	for(int i = 0; i < certouerrad.size(); i++) {
			
			
			
			System.out.println(certouerrad.get(i));
			
			
			
		}
		
	}
	
public String getNots() {
	return nots;
	}

public void setNots(String nots) {
	this.nots = nots;
	
	certouerrad.add(nots);
	}	
	
}
