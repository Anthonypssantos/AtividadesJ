package Pacote1;

public class fatura {
	
	private String numero;
	private Double preco;
	private int quantidade;
	
	//
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco += preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
}
