package la�osderepeti��o;

public class Exerc�cio02 {

	/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	
	public static void main(String[] args) {
		
		int c = 0;
		
		for(c = 0; c <= 10; c++) {
			if (c % 2 == 0) {
				System.out.println("Par: " + c);
			}	else if (c % 2 == 1) {
				System.out.println("�mpar: " + c);
			}  	
		}

	}

}
