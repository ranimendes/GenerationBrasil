package la�osderepeti��o;

import java.util.Scanner;

public class Exerc�cio05 {

	/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
	
		public static void main(String[] args) {
		
		int num, soma = 0;
		
		Scanner ler = new Scanner (System.in);
	
		do {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			soma = soma + num;
		} while (num != 0);
			System.out.println("Soma: " + soma);
			ler.close();
	}	

}
