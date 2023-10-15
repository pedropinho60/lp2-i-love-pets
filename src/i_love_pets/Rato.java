package i_love_pets;

public class Rato extends Pet {

	public Rato() {
		super();
	}

	public Rato(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public String toString() {
		return "Tipo de animal: Rato, Nome: " + super.getNome() + ", Idade: " + super.getIdade()+ " Ano(s)";
	}
}
