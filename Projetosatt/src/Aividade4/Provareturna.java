package Aividade4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Provareturna {
	
	private double nota=0.0;
	private String nome=" ", nom=" ";
	double compara;
	
	ArrayList<String> nomes2 = new ArrayList<>();
	ArrayList<Double> notas2 = new ArrayList<>(); 
	
	ArrayList<String> nomes = new ArrayList<>();
	ArrayList<Double> notas = new ArrayList<>(); 
	
	public void print() {
		
		for(int i = 0; i < notas.size(); i++) {
			
			compara = notas.get(i);
			nom = nomes.get(i);
			
			if(compara > notas.get(i)) {
				
				nomes2.add(nom);
				notas2.add(compara);
				
				JOptionPane.showMessageDialog(null,"Maior: "+nomes2.get(i)+": "+notas2.get(i));
			
			}else if (compara == notas.get(i)) {
				
				JOptionPane.showMessageDialog(null, "Iguais: "+nomes.get(i)+": "+notas.get(i));
				
			}
			
		}
			
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	
	nomes.add(nome);
	}



	public double getNota() {
				
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
		
		notas.add(nota);	
	
	}
	
}
