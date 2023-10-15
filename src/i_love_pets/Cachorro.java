package i_love_pets;

public class Cachorro extends Pet {
	
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public String toString() {
		return "Tipo de animal: Cachorro, Nome: " + super.getNome() + ", Idade: " + super.getIdade()+ " Ano(s)";
	}
}
