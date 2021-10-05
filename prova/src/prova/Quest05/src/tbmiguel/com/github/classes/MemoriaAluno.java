package tbmiguel.com.github.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MemoriaAluno {
	
public static ArrayList<Aluno> AlunoLista = new ArrayList<>();

	public static void add(Aluno aluno) { //Adiciona um Objeto aluno em memória
		AlunoLista.add(aluno);
	}

	public static void remove(Aluno aluno) { //Remove um Objeto aluno em memória
		for(Aluno a : AlunoLista) {
			if(a.getNome().equals(aluno.getNome())) {
				AlunoLista.remove(a);
			}
		}
	}
	
	public static void gravar(String NomeArquivo){  //Grava Alunos em um Arquivo
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(NomeArquivo)));
			
			for (Aluno a : AlunoLista) {
				out.write(a.getId() + ";" + a.getNome() + ";" + a.getEmail() + ";" + a.getRa() + "\n");
			}
			out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void ler(String NomeArquivo) {  //Lê Alunos em um Arquivo
		try {
			Scanner sc = new Scanner(new File(NomeArquivo));
			while (sc.hasNext()) {
	            System.out.print(sc.nextLine() + "\n");
	        }
	        sc.close();
	        
			} catch (IOException e) {
			e.printStackTrace();
			}
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Aluno a : AlunoLista) {
			sb.append("ID: " + a.getId() + "\n");
			sb.append("Nome: " + a.getNome() + "\n");
			sb.append("Idade: " + a.getRa() + "\n");
			sb.append("Email: " + a.getEmail() + "\n");
		}

		return sb.toString();
	}
}