package Ativiade1;

import javax.swing.JOptionPane;

public class Operacao {
	
	public String[] dados(String[] dado, int at,int env, int dia, int mes, int d,int m) {
		
		m = 7 - mes;
		d = 6 - dia;
		env = 2022 - at;
		
		JOptionPane.showMessageDialog(null, "Seu nome: "+dado[0]+"\nSeu dia: "+d+"\nSeu mês: "+m+"\nSua idade: "+ env+"\nSeu ano de nascimento: "+at);
		
		return dado;
	}
	
	public int einsteinisaac(){
		int ensteinisaac = 0;
		
		int me=0, de=0;
		int mn=0, dn=0;
		
		int meinsten = 3;
		int deinsten = 14;
		int einsten = 1879;
		
		int mnewton = 1;
		int dnewton = 4;
		int newton = 1643;
		
		int rnewton=0, reinsten=0;
		
		me = 7 - meinsten;
		de = 6 - deinsten;
		
		mn = 7 - mnewton;
		dn = 6 - dnewton;
				
		rnewton = 2022 - newton;
		reinsten = 2022 - einsten;
		
		JOptionPane.showMessageDialog(null, "Idade do Einsten em 2022: "+ reinsten + " Dia: "+de+" Mês: "+me+"\nIdade do Newton em 2022: "+ rnewton+" Dia: "+dn+" Mês: "+mn);
		
		return ensteinisaac;
	}
	
}
