package Nivell1;

	
	import java.util.InputMismatchException;
	import java.util.Scanner;

	/*Creu una classe amb un main() que generi un objecte de la classe Exception dins d'un 
	 * bloc try. Proporcioni al constructor de Exception un argument String. Capturi 
	 * l'excepci� dins d'una cl�usula catch i imprimeixi l'argument String. Afegeixi una 
	 * cl�usula finally i imprimeixi un missatge per a demostrar que va passar per all�.
	 */
	public class Exercici1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
	            String missatge = "No s� si he ent�s ben b� l'exercici";
	            throw new Exception(missatge);//genero objecte
	        } catch (Exception e) { //Capturo excepci�
	            System.out.println(e.getMessage());//imprimeixo argumennt String
	        } finally {
	            System.out.println("Missatge final");
	        }
	    }

	}
		

