package ClassesPOO;

public class Ex05main {

	public static void main(String[] args) {
		Ex05 patinete = new Ex05();
		patinete.setDistanciaPercorrida(50.0);
		patinete.setValor(150.00);
		System.out.println("O patinete custou R$" + patinete.getValor() + " e percorri " + patinete.getDistanciaPercorrida() + "m com ele");
	}

}