package laçosderepetição;

public class Exercício02 {

	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	
	public static void main(String[] args) {
		
		int c = 0;
		
		for(c = 0; c <= 10; c++) {
			if (c % 2 == 0) {
				System.out.println("Par: " + c);
			}	else if (c % 2 == 1) {
				System.out.println("Ímpar: " + c);
			}  	
		}

	}

}
