package la�osdedecis�o;

import java.util.Scanner;

public class Exerc�cio01 {
	
	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

	public static void main(String[] args) {
		
		int n1, n2, n3, maiorN = 0;
		
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Escreva o primeiro n�mero: ");
	n1 = leia.nextInt();
	
	System.out.println("Escreva o segundo n�mero: ");
	n2 = leia.nextInt();
	
	System.out.println("Escreva o terceiro n�mero: ");
	n3 = leia.nextInt();
	
		if (n1 > maiorN) {
			maiorN = n1;
		}
		if (n2 > maiorN) {
			maiorN = n2;
		}
		if (n3 > maiorN) {
			maiorN = n3;
		}		leia.close();
				
			System.out.println("Maior N�mero: " + maiorN);
	}
	
}
