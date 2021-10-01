package Nivell1;
 /*Exercici 4. Creu la seva pròpia classe de Exception utilitzant la paraula clau 
 * 'extends'. Escrigui un constructor per a aquesta classe que prengui un argument 
 * String i l'emmagatzemi dins de l'objecte com una referència de tipus String. 
 * Escrigui un mètode que mostri la cadena de caràcters emmagatzemada. 
 * Creu una clàusula try-*catch per a provar la nova excepció.*/

public class Exercici4 extends Exception{
	String missatge;

	public Exercici4(String missatge) {
		this.missatge=missatge;
	
	}
	public String mostraMissatge() throws Exception {
		return "Nova excepció";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exercici4("Nova excepció creada");
		} catch (Exercici4 e){
			System.out.println(e.getMessage());
		}
	}
}




	