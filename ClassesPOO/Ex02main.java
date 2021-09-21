package ClassesPOO;

public class Ex02main {
	public static void main(String[]args) {
		Ex02 aviao = new Ex02();
		aviao.setPeso(23.700);
		aviao.setTamanho(73);
		aviao.setPilotoNome("Rani");
		System.out.println("O piloto " + aviao.getPilotoNome() + " controla um avião comercial com peso de " 
		+ aviao.getPeso() + "kg e tamanho de: " + aviao.getTamanho() + "m");
	}
}