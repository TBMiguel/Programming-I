package quest07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class write {
	
	public static void escrever(String t, String NomeArquivo) {
		try {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(NomeArquivo)));
		out.write(t);
		out.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
