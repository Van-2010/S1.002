package Nivell1;

	
	import java.util.InputMismatchException;
	import java.util.Scanner;

	/*Creu una classe amb un main() que generi un objecte de la classe Exception dins d'un 
	 * bloc try. Proporcioni al constructor de Exception un argument String. Capturi 
	 * l'excepció dins d'una clàusula catch i imprimeixi l'argument String. Afegeixi una 
	 * clàusula finally i imprimeixi un missatge per a demostrar que va passar per allí.
	 */
	public class Exercici1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
	            String missatge = "No sé si he entès ben bé l'exercici";
	            throw new Exception(missatge);//genero objecte
	        } catch (Exception e) { //Capturo excepció
	            System.out.println(e.getMessage());//imprimeixo argumennt String
	        } finally {
	            System.out.println("Missatge final");
	        }
	    }

	}
		

