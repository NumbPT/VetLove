package model;

import java.util.ArrayList;

public class Ficha {
	
	ArrayList<Vacina> vacinas;
	ArrayList<Consulta> consultas;
	
	
	public Ficha(ArrayList<Vacina> vacinas, ArrayList<Consulta> consultas) {
		super();
		this.vacinas = vacinas;
		this.consultas = consultas;
	}


	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}


	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}


	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}


	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	
	
}
