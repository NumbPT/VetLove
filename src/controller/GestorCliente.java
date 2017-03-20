
package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Vacina;

public class GestorCliente {
	
	ArrayList<Cliente> arCliente;
	
	public GestorCliente(){
		this.arCliente = new ArrayList<Cliente>();
	}
	
	public void addClient(String nome, String morada, String email, String telefone) {
		
		Cliente c = new Cliente(nome, morada, email, telefone);
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
		
	}

	
public void addClient(Cliente c) {
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
		
	}


	public Cliente getCliente(int id) {
		/*foreeach
		 * Para cada cliente, sob a variavel c, dentro da colecçao arCliente, faz:
		 */
		for (Cliente c : arCliente) {
			
			if (c.getId()==id)
				return c;
		}
		return null;
	}
	
	public double getGastoVacinas(Cliente c) {
		/*
		  for (int i = 0; i < arCliente.size(); i++) {
			  Cliente c = arCliente.get(i);
			  //Continuar..
		  }
		*/
		
				double totalVacAnimais = 0;
			
			for (Animal a : c.getAnimais()) { //Para cada animal
				
					double totalVacinaAnimal = 0;
				
				for (Vacina v : a.getFicha().getVacinas()) { //Para cada vacina
					
					totalVacinaAnimal += v.getPreco();
					
				}
				totalVacAnimais += totalVacinaAnimal;
				/*
				 * Pode ser substituido por
				 */
//				totalVacAnimais += a.getGastosVacinas();
			}
			
		return totalVacAnimais;
		
	}
	
}
