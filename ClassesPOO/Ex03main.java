package ClassesPOO;

/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/

public class Ex03main {

	public static void main(String[] args) {
		Ex03 TV = new Ex03();
		TV.setNomeProduto("TV");
		TV.setPreco(1499.99);
		System.out.println("O produto " + TV.getNomeProduto() + " custa R$" + TV.getPreco());
	}

}