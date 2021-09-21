package laçosdedecisão;

import java.util.Scanner;

public class Exercício02 {

	/* Faça um programa que entre com três números e coloque em ordem crescente.. */

	public static void main(String[] args) {
		
		int n1, n2, n3;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Escreva o primeiro número: ");
	n1 = leia.nextInt();
	
	System.out.println("Escreva o segundo número: ");
	n2 = leia.nextInt();
	
	System.out.println("Escreva o terceiro número: ");
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