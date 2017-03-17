package model;

public class Vacina {

	private String data,
					nome;
	private double preco;
	public Vacina(String data, String nome, double preco) {
		super();
		this.data = data;
		this.nome = nome;
		this.preco = preco;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
