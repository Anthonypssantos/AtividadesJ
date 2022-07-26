package Atividade1;

public class Produtos extends Estoque{
	
	Estoque est = new Estoque();
	
	private int batata;
	private int arroz;
	private int feijao;
	private int frango;
	private int mate;
	
	public void colcecham() {
		
		est.setArroz(arroz);
		est.setBatata(batata);
		est.setFeijao(feijao);
		est.setFrango(frango);
		est.setMate(mate);
	
	}
	
	public int getBatata() {
		return batata;
	}
	public void setBatata(int batata) {
		this.batata = batata;
	}
	public int getArroz() {
		return arroz;
	}
	public void setArroz(int arroz) {
		this.arroz = arroz;
	}
	public int getFeijao() {
		return feijao;
	}
	public void setFeijao(int feijao) {
		this.feijao = feijao;
	}
	public int getFrango() {
		return frango;
	}
	public void setFrango(int frango) {
		this.frango = frango;
	}
	public int getMate() {
		return mate;
	}
	public void setMate(int mate) {
		this.mate = mate;
	}
	
	
	
	

}
