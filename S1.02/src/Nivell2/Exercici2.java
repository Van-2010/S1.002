package Nivell2;

import java.util.InputMismatchException;

/*Repeteixi l'exercici anterior, per� dins de la cl�usula catch, emboliqui 
 * l'excepci� 'g()' dins d'una RuntimeException.
 */
public class Exercici2 {
	
	public static void main(String[]args) {
		f();
	}
	public static void f()throws RuntimeException{
		try {
		g();
		}
	    catch(RuntimeException e){
	    
	    } finally {
            System.out.println("Missatge final bis");
	    }
	}		
	public static void g() {
		try {
		String missatge = "No s� si he ent�s ben b� l'exercici";
        throw new InputMismatchException(missatge);//genero nova excepci�
		} catch (InputMismatchException e) { //Capturo excepci�
            System.out.println(e.getMessage());//imprimeixo argument String
        } finally {
            System.out.println("Missatge final");
        }
	}
}


