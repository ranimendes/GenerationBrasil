package herança;

public class Cachorro extends Ex01Animal {
	
	public void correndo () {
		System.out.println("Dog ta corendo!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo");
	}

	@Override
	public void testaAnimal(Ex01Animal animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void testaAnimal(Cavalo cavalo) {
		// TODO Auto-generated method stub
		
	}
	
/*	Ex01Animal cachorro = new Ex01Animal();
	
	cachorro.setNome("Bidu");
	cachorro.setIdade(1);
	cachorro.setEmitirSom("Latido");*/
	
	

	}
