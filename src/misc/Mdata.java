package misc;

import java.util.ArrayList;

import model.Consulta;
import model.Vacina;

public class Mdata {

	public static Vacina vac= new Vacina("200317","rabiolis",13.4);
	
	public static Consulta con= new Consulta("200317", "Validar Vacinas");
			
	public static ArrayList<Vacina> arvacs = new ArrayList<Vacina>();
	
	public static ArrayList<Consulta> arCons = new ArrayList<Consulta>();
	
	
	public static Ficha fl = new Ficha(arvacs, arCons);
	
	public static Animal an = new Animal("Cao", "Pastor Alemao", "200317", fl);
	public static Client cl = new Cliente("Abel", "Seixal", "abel@gmail.com", "213456789");
	
	public static void fillData() {
		arvacs.add(vac);
		arCons.add(con);
		cl.getAnimais().add(an);
	}
}
