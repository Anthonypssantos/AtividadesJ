package Ativiade1;

import javax.swing.JOptionPane;

public class Operacao {
	
	public String[] dados(String[] dado, int at, int env) {
		
		
		env = 2022 - at;
	
		JOptionPane.showMessageDialog(null, "Seu nome: "+dado[0]+"\nDia atual: "+dado[1]+"\njMês atual: "+dado[2]+"\nSua idade: "+ env+"\nSeu ano de nascimento: "+at);
		
		return dado;
	}
	
	public int einsteinisaac(){
		int ensteinisaac = 0;
		
		int einsten = 1879;
		int newton = 1643;
		int rnewton=0, reinsten=0;
		
		rnewton = 2022 - newton;
		reinsten = 2022 - einsten;
		
		JOptionPane.showMessageDialog(null, "Idade do Enisten em 2022: "+ reinsten + "\nIdade do Newton em 2022: "+ rnewton);
		
		return ensteinisaac;
	}
	
}
