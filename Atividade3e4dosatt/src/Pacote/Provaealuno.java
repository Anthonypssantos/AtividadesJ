package Pacote;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class Provaealuno {
	

	private double nota=0.0;
	private String nom=" ";
	private int alunos=0;
	
	
	ArrayList<String> nomes2 = new ArrayList<>();
	ArrayList<Double> notas2 = new ArrayList<>(); 
	
	ArrayList<Double> iguais = new ArrayList<>();
	ArrayList<String> nomescomp = new ArrayList<>();
	
	
	ArrayList<String> nomes = new ArrayList<>();
	ArrayList<Double> notas = new ArrayList<>(); 
	
	public void print() {
		
		for(int i = 0;i < notas.size(); i++) {
			
			JOptionPane.showMessageDialog(null, "Nome: "+nomes.get(i)+"Maior nota: "+notas.get(i));
			
		}
	
	}
	
	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
		
		nomes.add(nom);
	}

	public double getNota() {
				
		return nota;
	}

	public void setNota(double nota) {
		this.nota += nota;
		
		double recebe=0.0;		
		
		notas.add(nota);
		
		Collections.sort(notas);
		
		for(int i = 0; i < notas.size(); i++) {
			
			recebe = notas.get(i);
			nom = nomes.get(i);
			
			if(recebe == notas.get(i)) {
				
				iguais.add(recebe);
				nomescomp.add(nom);
				
			}else {
				
				notas2.add(nota);
				nomes2.add(nom);
				
			}
			
		}
		
	}	
	
}
