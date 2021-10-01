package Nivell2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Creu una classe amb dos mètodes, 'f()' i 'g()'. En 'g()', generi una excepció d'un 
 * nou tipus. En 'f()' invoqui a 'g()', capturi la seva excepció i, en la clàusula 
 * catch, generi una excepció diferent (d'un segon tipus, també nou). Comprovi el codi 
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
		String missatge = "No sé si he entès ben bé l'exercici";
        throw new InputMismatchException(missatge);//genero nova excepció
		} catch (InputMismatchException e) { //Capturo excepció
            System.out.println(e.getMessage());//imprimeixo argumenntString
        } finally {
            System.out.println("Missatge final");
        }
	}
}

