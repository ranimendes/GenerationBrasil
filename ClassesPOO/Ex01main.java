package ClassesPOO;

/*1) Crie uma classe cliente e apresente os atributos e m?todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa??es deste objeto no console.*/

public class Ex01main {
	public static void main(String[]args) {
		Ex01 cliente = new Ex01();
		cliente.setIdade(21);
		cliente.setNome("Carlos");
		cliente.setSexo("Masculino");
		cliente.setUsuario("Carl");
		
		System.out.println("Nome: " + cliente.getNome() + " | idade: " + cliente.getIdade()
		+ " | Sexo: " + cliente.getSexo() + " | Usu?rio: " + cliente.getUsuario());
	}
}