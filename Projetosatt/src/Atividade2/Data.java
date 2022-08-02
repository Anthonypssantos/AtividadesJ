package Atividade2;

import javax.swing.JOptionPane;

public class Data {
	
	private int dia, mes, mesextenso, ano, bissexto;
	int diap=26,anop=2022,mesp=7;
	
	public void construtor() {
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Coloque o dia atual 'NUMERO'"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Coloque o mês atual 'NUMERO'"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ano atual 'NUMERO'"));
		
		if(dia == diap && mes == mesp && ano == anop) {
			
		JOptionPane.showMessageDialog(null, "Data está correta: "+ dia+"/"+mes+"/"+ano);	
			
		compara();
		
		}else {
			
			dia = 1;
			mes = 1;
			ano = 1;
			JOptionPane.showMessageDialog(null, "A data inserida está errada receba => 0"+dia+"/0"+mes+"/000"+ano);

		compara();
		
		}
	}
	
	
	public void compara() {

		JOptionPane.showMessageDialog(null, dia);
		
		if(dia == diap && mes == mesp && ano == anop) {
			
			JOptionPane.showMessageDialog(null, "Data igual: "+0);
				
			compara();	
		}
		
		if (dia > diap || mes > mesp || ano > ano) {
			
			JOptionPane.showMessageDialog(null, "Data corrente: "+ 1);
			
		}
		
		if (dia > diap && mes > mesp && ano > ano) {
			
			JOptionPane.showMessageDialog(null, "Data mairo: "+ -1);
			
		}
		
		dados();
		
	}

	

	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getMesextenso() {
		return mesextenso;
	}


	public void setMesextenso(int mesextenso) {
		this.mesextenso = mesextenso;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getBissexto() {
		return bissexto;
	}


	public void setBissexto(int bissexto) {
		this.bissexto = bissexto;
	}
	
	public void dados() {	
		
		JOptionPane.showMessageDialog(null, "Data: "+ getDia()+"/"+getMes()+"/"+getAno());
		
	}
	
}
