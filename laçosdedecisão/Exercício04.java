package la�osdedecis�o;

import java.util.Scanner;

public class Exerc�cio04 {

	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/ 
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par...");
			raiz = Math.sqrt(num);
			System.out.println("Raiz Quadrada: " + raiz);
		}
		else if(num % 2 == 1) {
			System.out.println("�mpar...");
			elevado = Math.pow(num, 2);
			System.out.println("Elevado: " + elevado);
			
			ler.close();
		}
	}

}
