package Nivell2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Creu una classe amb dos m�todes, 'f()' i 'g()'. En 'g()', generi una excepci� d'un 
 * nou tipus. En 'f()' invoqui a 'g()', capturi la seva excepci� i, en la cl�usula 
 * catch, generi una excepci� diferent (d'un segon tipus, tamb� nou). Comprovi el codi 
 * en 'main()'.
 */
public class Exercici1 {
	
	public static void main(String[]args) {
		
		f();
	}
	public static void f(){
		try {
		g();
		}
	    catch(ArrayIndexOutOfBoundsException e){
	    
	    } finally {
            System.out.println("Missatge final bis");
	    }
	}		
	public static void g() {
		try {
		String missatge = "No s� si he ent�s ben b� l'exercici";
        throw new InputMismatchException(missatge);//genero nova excepci�
		} catch (InputMismatchException e) { //Capturo excepci�
            System.out.println(e.getMessage());//imprimeixo argumenntString
        } finally {
            System.out.println("Missatge final");
        }
	}
}

