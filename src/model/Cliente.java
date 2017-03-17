package model;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String morada;
	private String email;
	private String telefone;
	
	int id;
	
	private ArrayList<Animal> animais;
	
	public Cliente(String nome, String morada, String email, String telefone) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
		/*------------------------------------------------------------------------------------------------------*/
		animais = new ArrayList<>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Animal> getAnimais() {
		return animais;
	}


	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	
	
	
}
