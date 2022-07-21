package Atividade;

import javax.swing.JOptionPane;

public class mostraDados extends Pessoa{

	//mostra dados
	
	Pessoa pes = new Pessoa(); 
	
	public void print() {

		JOptionPane.showMessageDialog(null, "Nome: "+pes.getNome()+"\nIdade: "+pes.getIdade()+"\nCurso: "+pes.getCurso());
		
	}
	

	
}	
