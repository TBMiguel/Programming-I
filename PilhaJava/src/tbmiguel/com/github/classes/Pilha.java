package tbmiguel.com.github.classes;

import java.util.Stack;

public class Pilha extends Thread{
	
	private Stack<Integer> pilha = new Stack<>();
	
	public synchronized void empilharNumeros() throws InterruptedException {
		
		for (int i = 1; i<=10000000; i++) {
			pilha.add(i);
		}
		
	}
	
	public void mostrarPilha() {
		
		for (int i = 0; i<10000000; i++) {
			System.out.println(pilha.get(i));
		}
		
	}
	
	public void desempilhar() {
		
		System.out.println("\nDesempilhando...");
		
		while (pilha.isEmpty() == false) {
			System.out.println(pilha.pop());
		}
	}
	
	@Override
	public void run() {
		try {
			empilharNumeros();
			mostrarPilha();
			desempilhar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
