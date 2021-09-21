package herança;

public abstract class Ex01Animal implements Ex01InterfaceAnimal {

	private String nome = "";
	private int idade = 0;
	private String emitirSom;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	protected abstract void testaAnimal(Cavalo cavalo);
	
}
