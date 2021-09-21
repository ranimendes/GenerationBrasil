package herança;

public class Cavalo extends Ex01Animal {
	
	public void orrendo () {
		System.out.println("Cavalo ta corendo!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cavalo está emitindo som!");
	}

	@Override
	public void testaAnimal(Ex01Animal animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void testaAnimal(Cavalo cavalo) {
		// TODO Auto-generated method stub
		
	}
	
	/*Ex01Animal cavalo = new Ex01Animal();
	
	cavalo.setNome("Brabo");
	cavalo.setIdade(2);
	cavalo.setEmitirSom("Relincha");*/
	
	

	}
