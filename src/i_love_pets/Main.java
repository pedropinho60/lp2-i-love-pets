package i_love_pets;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();

        PrestadorDeServicos prestador1 = new PrestadorDeServicos("Jose");
        prestador1.cadastrarEspecialidade("Cuidado de cães");
        prestador1.cadastrarEspecialidade("Treinamento de gatos");
        usuarios.add(prestador1);

        PrestadorDeServicos prestador2 = new PrestadorDeServicos("João");
        prestador2.cadastrarEspecialidade("Banho de pássaros");
        prestador2.cadastrarEspecialidade("Passeio de cachorros");
        usuarios.add(prestador2);

        usuarios.add(new Tutor("Carlos"));
        usuarios.add(new Vendedor("Antonio"));
        
        pets.add(new Rato("Ratatui", 2));
        pets.add(new Cachorro("Scoby", 5));
        pets.add(new Gato("Tom", 4));
        pets.add(new Coelho("Perna Curta", 6));


        System.out.println("Lista de usuarios: ");
        for (Usuario usuario : usuarios) {
        	System.out.println(usuario.toString());
        }

        System.out.println("Lista de pets: ");
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }

    }
}