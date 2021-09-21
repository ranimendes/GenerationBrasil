package herança;

public class Ex01main {

	public static void main(String[] args) {
	
		Ex01ClasseTestaAnimal animal = new Ex01ClasseTestaAnimal();
		
		animal.testaAnimal(new Preguiça());
		animal.testaAnimal(new Cachorro());
		animal.testaAnimal(new Cavalo());;
		
		
	}
}