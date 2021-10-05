package quest07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read {

	public static void ler(String NomeArquivo) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(NomeArquivo));
			
			String linha = in.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = in.readLine();
			}
			
			in.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
}
