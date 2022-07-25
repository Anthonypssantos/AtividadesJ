package Atividade1;

public class Estoque {
	
	private int batata = 100;
	private int arroz = 100;
	private int feijao = 100;
	private int frango = 100;
	private int mate = 100;
	
	//========================================================
	//Alimentos
	
	//getbatata
	public int getBatata() {
		return batata;
	}
	//setbatata
	public void setBatata(int batata) {
		
		if(this.batata == 0) {
			
			this.batata = 0;
			
		}else {
			
			this.batata -= batata;	
			
		}
		
		
	}
	//getarroz
	public int getArroz() {
		return arroz;
	}
	//setarroz
	public void setArroz(int arroz) {
		
		if(this.arroz == 0) {
			
			this.arroz = 0;
			
		}else {
			
			this.arroz -= arroz;	
			
		}
		
	}
	//getFeijão
	public int getFeijao() {
		return feijao;
	}
	//setFeijão
	public void setFeijao(int feijao) {
		
		if(this.feijao == 0) {
			
			this.feijao = 0;
			
		}else {
			
			this.feijao -= feijao;	
			
		}
		
	}
	//getfrango
	public int getFrango() {
		return frango;
	}
	//setfrango
	public void setFrango(int frango) {
		
		if(this.frango == 0) {
			
			this.frango = 0;
			
		}else {
			
			this.frango -= frango;	
			
		}
			
	}
	//getmate
	public int getMate() {
		return mate;
	}
	//setmate
	public void setMate(int mate) {
		
		if(this.mate == 0) {
			
			this.mate = 0;
			
		}else {
			
			this.mate -= mate;	
			
		}
	
	}
	
}
