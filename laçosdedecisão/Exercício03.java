package la�osdedecis�o;

import java.util.Scanner;

public class Exerc�cio03 {

	
	/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:*/
	/* 10 - 14 infantil / 15-17 juvenil / 18-25 adulto*/
	
	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escreva sua idade: ");
		idade = leia.nextInt();
		
		if (idade < 10) {
			System.out.println("Idade Inv�lida");
		}
			if (idade >= 10 && idade < 15) {
				System.out.println("Infantil");
			}
			if (idade >= 15 && idade < 18) {
				System.out.println("Juvenil");
		}
			if (idade >= 18 && idade < 26) {
				System.out.println("Adulto");
				
				leia.close();
			}

	}

}
