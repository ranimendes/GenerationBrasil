package la�osderepeti��o;

import java.util.Scanner;

public class Exerc�cio06 {

	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
	
		public static void main(String[] args) {
		
		int num, soma = 0, mult = 0;
		int media = 0;
		
		Scanner ler = new Scanner (System.in);
	
		do {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			if (num % 3 == 0 && num != 0) {
				mult = mult + 1;
				soma = num + soma;
				media = soma / mult;
			}
		} while (num != 0);
			System.out.println("M�dia: " + media);
			ler.close();
	}	

}
