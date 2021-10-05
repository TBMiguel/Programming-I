package tbmiguel.com.github.main;

import tbmiguel.com.github.classes.Aluno;
import tbmiguel.com.github.classes.MemoriaAluno;
//import tbmiguel.com.github.classes.read;
//import tbmiguel.com.github.classes.write;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(1, "Miguel", "miguel.junior@alunos.unicesumar.edu.br" , "200835702");
		Aluno a2 = new Aluno(2, "Caio", "caio@alunos.unicesumar.edu.br" , "102783647");
		Aluno a3 = new Aluno(3, "Jean", "Jean@alunos.unicesumar.edu.br" , "209478173");
		
		MemoriaAluno.add(a1);
		MemoriaAluno.add(a2);
		MemoriaAluno.add(a3);
		
		//System.out.println(AlunoLista);
		
		MemoriaAluno.gravar("teste.txt");
		MemoriaAluno.ler("teste.txt");
		
		//write.escrever("Estou testando um arquivo texto\nSó mais um teste", "teste.txt");
		//read.ler("teste.txt");


	}

}
