package laçosderepetição;

import java.util.Scanner;

public class Exercício05 {

	/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
	
		public static void main(String[] args) {
		
		int num, soma = 0;
		
		Scanner ler = new Scanner (System.in);
	
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma = soma + num;
		} while (num != 0);
			System.out.println("Soma: " + soma);
			ler.close();
	}	

}
