package i_love_pets;

public class Tutor extends Usuario {
	
	public Tutor() {
		super();
	}
	
	public Tutor(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "Tipo de usuário: Tutor, Nome: " + super.getNome();
	}

}
