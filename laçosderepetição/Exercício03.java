package laçosderepetição;

public class Exercício03 {

	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		
		int i = 0;
		
			while (i <= 99) {
				if (i > 0 && i <= 21 ) {
					System.out.println("Menor de 21 anos: " + i);
				}	else if (i >= 50 && i < 100) {
					System.out.println("Maior que 50: " + i);
				}   i++;
			}

	}

}
