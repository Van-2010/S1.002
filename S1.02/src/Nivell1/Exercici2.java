package Nivell1;

/*Exercici 2. Defineixi una refer�ncia a un objecte i inicialitzi-la amb null. 
 * Tracti d'invocar un m�tode a trav�s d'aquesta refer�ncia. Ara envolti el codi 
 * amb una cl�usula try-*catch per a capturar l'excepci�.
 */

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Exercici2 referencia=null; //inici objecte amb null. No li hem posat el new i no es pot crear un objecte
		referencia.metodeReferencia();//crida al m�tode
		}catch(Exception e){  //capturo l'excepci�
				System.out.println(e);
			}
	}
	public void metodeReferencia() {
	System.out.println("S�c un m�tode");
	}
}
