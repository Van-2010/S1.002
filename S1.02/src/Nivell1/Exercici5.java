package Nivell1;

import java.util.Scanner;

/*Exercici 5. Defineixi un comportament de tipus represa utilitzant un bucle 'while' 
 * que es repeteixi fins que es deixi de generar una excepció.
 */
public class Exercici5 {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean continuar= true;
		while  (continuar){
			try {
			
			System.out.println("Ingressi un número sencer:");
			
			Scanner scanner = new Scanner(System.in);
			int num1 = scanner.nextInt(); 
			scanner.close();
			
			System.out.println("El quadrat del número és "+ (num1*num1));
			continuar = false;
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			
				}							
			}
			
		}

	}


