package laçosderepetição;

public class Exercício01 {
	
	/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

	public static void main(String[] args) {
		
		int c = 1000;
		
		for(c = 1000; c <= 1999; c++) {
			if (c % 11 == 5) {
				System.out.println("Dividido por 11 = " + c);
			}
		}
			

	}

}
