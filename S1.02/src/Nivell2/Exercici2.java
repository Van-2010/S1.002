package Nivell2;

import java.util.InputMismatchException;

/*Repeteixi l'exercici anterior, però dins de la clàusula catch, emboliqui 
 * l'excepció 'g()' dins d'una RuntimeException.
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
		String missatge = "No sé si he entès ben bé l'exercici";
        throw new InputMismatchException(missatge);//genero nova excepció
		} catch (InputMismatchException e) { //Capturo excepció
            System.out.println(e.getMessage());//imprimeixo argument String
        } finally {
            System.out.println("Missatge final");
        }
	}
}


