package ClassesPOO;

/*Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Ex07main {

	public static void main(String[] args) {
		Ex07 paciente = new Ex07();
		paciente.setIdade(27);
		paciente.setNomePaciente("Raniel");
		paciente.setNomeDoenca("Bronquite");
		
		System.out.println("O paciente " + paciente.getNomePaciente() + " com idade de " 
		+ paciente.getIdade() + " anos, possui a doen�a: " + paciente.getNomeDoenca());
		
	}

}