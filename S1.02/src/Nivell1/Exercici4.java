package Nivell1;
 /*Exercici 4. Creu la seva pr�pia classe de Exception utilitzant la paraula clau 
 * 'extends'. Escrigui un constructor per a aquesta classe que prengui un argument 
 * String i l'emmagatzemi dins de l'objecte com una refer�ncia de tipus String. 
 * Escrigui un m�tode que mostri la cadena de car�cters emmagatzemada. 
 * Creu una cl�usula try-*catch per a provar la nova excepci�.*/

public class Exercici4 extends Exception{
	String missatge;

	public Exercici4(String missatge) {
		this.missatge=missatge;
	
	}
	public String mostraMissatge() throws Exception {
		return "Nova excepci�";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exercici4("Nova excepci� creada");
		} catch (Exercici4 e){
			System.out.println(e.getMessage());
		}
	}
}




	