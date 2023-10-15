package i_love_pets;

import java.util.ArrayList;

public class PrestadorDeServicos extends Usuario {
	ArrayList<String> especialidades;

	public PrestadorDeServicos() {
		super();
		especialidades = new ArrayList<String>();
	}
	
	public PrestadorDeServicos(String nome) {
		super(nome);
		especialidades = new ArrayList<String>();
	}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}
	
	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}

	public void cadastrarEspecialidade(String especialidade) {
		especialidades.add(especialidade);
	}

	@Override
	public String toString() {
		String str = "Tipo de usuário: Prestador de serviços para pets, Nome: " + super.getNome() + ", Especialidades: ";
		
		for(int i=0; i<especialidades.size(); i++) {
			if(i != 0) {
				str += ", ";	
			}
			
			str += especialidades.get(i);
		}
		return str;
	}
}
