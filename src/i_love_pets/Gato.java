package i_love_pets;

public class Gato extends Pet {

	public Gato() {
		super();
	}

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public String toString() {
		return "Tipo de animal: Gato, Nome: " + super.getNome() + ", Idade: " + super.getIdade() + " Ano(s)";
	}
}
