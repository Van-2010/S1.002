package Nivell1;
/*Exercici 3. Escrigui codi per a generar i capturar una excepció 
 * ArrayIndexOutOfBoundsException.
 */
public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
	String[]actors=new String[3];
	actors[0]="Rita Hayworth";
	actors[1]="Cary Grant";
	actors[2]="Grace Kelly";
	actors[3]="Humphrey Bogart";
	
	for(int i=0;i<=actors.length;i++) {
		System.out.println(actors[i]);
	}
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("L'Array no està ben creat.");
	}
	}
	}

