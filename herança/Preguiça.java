package herança;

public class Preguiça extends Ex01Animal {
	
	public void subindo () {
		System.out.println("A preguiça está subindo!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("A preguiça está emitindo som!");
	
	
	/*Ex01Animal preguica = new Ex01Animal();
	
	preguica.setNome("Soneca");
	preguica.setIdade(2);
	preguica.setEmitirSom("Sim");*/
	
	

	}

	@Override
	public void testaAnimal(Ex01Animal animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void testaAnimal(Cavalo cavalo) {
		// TODO Auto-generated method stub
		
	}


	}
