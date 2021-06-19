package tbmiguel.com.github.agendas.main;

import java.util.ArrayList;

import tbmiguel.com.github.agendas.classes.Contato;
import tbmiguel.com.github.agendas.classes.Endereco;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua exemplo2", "São Paulo", "SP", "80491-680");
		Endereco endereco2 = new Endereco("Rua exemplo1", "Curitiba", "PR", "85410-960");
		
		ArrayList<Endereco> ListaEnderecos = new ArrayList<>();
		ListaEnderecos.add(endereco);
		ListaEnderecos.add(endereco2);
		
		Contato contato = new Contato("João", "Barbosa", "(41) 98752-5180", "joao@uol.com.br", ListaEnderecos);

		System.out.println(contato.toString());
		System.out.println("Quantos enderecos: " + contato.getEnderecos().size());
		
		for(int i=0; i < contato.getEnderecos().size(); i++) {
			System.out.println("Rua: " 
					+ contato.getEnderecos().get(i).getRua() + " - "
					+ contato.getEnderecos().get(i).getCidade() + ", "
					+ contato.getEnderecos().get(i).getEstado() + " - "
					+ contato.getEnderecos().get(i).getCep());
		}
	
	}
		
}
