package application;

import misc.Mdata;

public class App {

	public static void main(String[] args) {
	
	System.out.println("Ola Turma!");
	
	Mdata.fillData();
	
	GestorCliente gc = nes GestorCliente();
	gc.addCliente(Mdata.cl);

	}

}
