package laçosderepetição;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
		int idade, sexo, op, c = 0;
		int pc = 0, mn = 0, ha = 0, oc = 0, pnm = 0, pcm = 0;
		
		
		while (c < 3 ) {
		System.out.println("Sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Seu sexo 1 para homem e 2 para mulher 3 outros: ");
		sexo = ler.nextInt();
		
		System.out.println("Opções: ");
		op = ler.nextInt();
		
		if (op == 1) {
			pc++;
		} else if (sexo == 2 && op == 2) {
			mn++;
		} else if (sexo == 1 && op == 3) {
			ha++;
		} else if (sexo == 3 && op == 1 ) {
			oc++;
		} else if (sexo > 0 && op == 2 && idade > 39) {
			pnm++;
		} else if (sexo > 0 && op == 1 && idade < 18)
			pcm++;
			c++;
	}	
		System.out.println("Número de pessoas calmas: " + pc);
		System.out.println("Número de mulheres nervosas: " + mn);
		System.out.println("Número de homens agressivos: " + ha);
		System.out.println("Número de outros calmos: " + oc);
		System.out.println("Número de pessoas nervosas 40+: " + pnm);
		System.out.println("Número de pessoas calmas 18-: " + pcm);
		ler.close();

}
}