package la�osdedecis�o;

import java.util.Scanner;

public class Exerc�cio02 {

	/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.. */

	public static void main(String[] args) {
		
		int n1, n2, n3;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Escreva o primeiro n�mero: ");
	n1 = leia.nextInt();
	
	System.out.println("Escreva o segundo n�mero: ");
	n2 = leia.nextInt();
	
	System.out.println("Escreva o terceiro n�mero: ");
	n3 = leia.nextInt();
		
	leia.close();
	
		if (n1 > n2 && n1 > n3 ) {
			System.out.println(n1+" "+ n2 + " " + n3);
		}
		if (n1 > n3 && n1 > n2 ) {
			System.out.println(n1+" "+ n3 + " " + n2);
		}
		if (n2 > n1 && n2 > n3 ) {
			System.out.println(n2+" "+ n1+ " " + n3);
		}
		if (n2> n3 && n2> n1) {
			System.out.println(n2+" "+ n3 + " " + n1);
		}
		if (n3> n1 && n3> n2) {
			System.out.println(n3+" "+ n1 + " " + n2);
		}
		if (n3 > n2 && n3>n1) {
			System.out.println(n3+" "+ n2 + " " + n1);
		}
	
	}
}