package i_love_pets;

public class Coelho extends Pet {

	public Coelho() {
		super();
	}

	public Coelho(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public String toString() {
		return "Tipo de animal: Coelho, Nome: " + super.getNome() + ", Idade: " + super.getIdade()+ " Ano(s)";
	}
}
