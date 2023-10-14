package i_love_pets;

public class Vendedor extends Usuario {
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "Tipo de usuário: Vendedor, Nome: " + super.getNome();
	}

}
