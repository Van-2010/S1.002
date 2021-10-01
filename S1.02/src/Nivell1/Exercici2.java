package Nivell1;

/*Exercici 2. Defineixi una referència a un objecte i inicialitzi-la amb null. 
 * Tracti d'invocar un mètode a través d'aquesta referència. Ara envolti el codi 
 * amb una clàusula try-*catch per a capturar l'excepció.
 */

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Exercici2 referencia=null; //inici objecte amb null. No li hem posat el new i no es pot crear un objecte
		referencia.metodeReferencia();//crida al mètode
		}catch(Exception e){  //capturo l'excepció
				System.out.println(e);
			}
	}
	public void metodeReferencia() {
	System.out.println("Sóc un mètode");
	}
}
