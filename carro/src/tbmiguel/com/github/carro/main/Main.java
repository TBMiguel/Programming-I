package tbmiguel.com.github.carro.main;

import java.util.Scanner;

import tbmiguel.com.github.carro.classes.Carro;
import tbmiguel.com.github.carro.classes.Endereco;
import tbmiguel.com.github.carro.classes.Proprietario;

public class Main {

	public static void main(String[] args) {
		
		int op = 0;
		Scanner scan = new Scanner(System.in);
		
		String Rua, Bairro, Cidade, Estado, comple, nome, RG, CPF, modelo, cor, marca;
		int cep, nPortas, nMarchas;
		float velocMax;
		System.out.println("Informe a Rua do proprietario: ");  //Informações Endereço do Proprietario
		Rua = scan.nextLine();
		scan.nextLine();
		System.out.println("Informe a Bairro do proprietario: ");
		Bairro = scan.nextLine();
		System.out.println("Informe a Cidade do proprietario: ");
		Cidade = scan.nextLine();
		System.out.println("Informe a Estado do proprietario: ");
		Estado = scan.nextLine();
		Endereco endereco = new Endereco(Rua, Bairro, Cidade, Estado);
		System.out.println("informe o CEP: ");
		cep = scan.nextInt();
		endereco.setCep(cep);
		scan.nextLine();
		System.out.println("informe o Complemento: [Deixe em branco se não haver] ");
		comple = scan.nextLine();
		endereco.setComplemento(comple);
		System.out.println("Informe o Nome do proprietario: ");  // Dados do proprietario
		nome = scan.nextLine();
		System.out.println("Informe o RG do proprietario: ");
		RG = scan.nextLine();
		System.out.println("Informe o CPF do proprietario: ");
		CPF = scan.nextLine();
		Proprietario proprietario = new Proprietario(nome,CPF, RG, endereco.getEndereco());
		System.out.println("Informe a data de nascimento do proprietario: ");
		proprietario.setDataNasc(scan.nextLine());
		System.out.println("\n Proprietario cadastrado com sucesso.\n");
		System.out.println("Informe o modelo do carro: ");
		modelo = scan.nextLine();
		System.out.println("Informe o cor do carro: ");
		cor = scan.nextLine();
		System.out.println("Informe a marca do carro: ");
		marca = scan.nextLine();
		System.out.println("Informe a velocidade máxima do carro: ");
		velocMax = scan.nextFloat();
		System.out.println("Informe o número de portas do carro: ");
		nPortas = scan.nextInt();
		System.out.println("Informe o número de marchas do carro: ");
		nMarchas = scan.nextInt();
		scan.nextLine();
		Carro carro = new Carro(modelo, cor, marca, proprietario.getProprietario(),velocMax, nPortas, nMarchas);
		System.out.println("Informe o Chassi do carro: ");
		carro.setChassi(scan.nextLine());
		scan.nextLine();
		System.out.println("Informe o ano do carro: ");
		carro.setAno(scan.nextInt());
		scan.nextLine();
		System.out.println("Carro tem teto solar? [S/N] ");
		carro.setTemTeto(scan.nextLine());
		System.out.println("Carro tem câmbio automático? [S/N] ");
		carro.setCambioAuto(scan.nextLine());
		System.out.println("\n Carro cadastrado com sucesso.");
		
		do {
			System.out.println("\n [1] Acelerar\n [2] Reduz Velocidade\n [3] Freiar\n "
					+ "[4] Trocar Marcha\n [5] Reduz Marcha\n [6] Marcha Ré\n [7] Mostrar Dados Proprietario \n [00] Sair");
			op = scan.nextInt();
			
			switch(op) {
				case 1:
					carro.acelera();
					break;
				case 2:
					carro.reduzVelocidade();
					break;
				case 3:
					carro.freia();
					break;
				case 4:
					carro.trocaMarcha();
					break;
				case 5:
					carro.reduzMarcha();
					break;
				case 6:
					carro.marchaRe();
					break;
				case 7: 
					System.out.println("\nNome: ");
					System.out.println(proprietario.getNome());
					System.out.println("RG: ");
					System.out.println(proprietario.getRG());
					System.out.println("CPF: ");
					System.out.println(proprietario.getCPF());
					System.out.println("Carro: ");
					System.out.println(carro.getModelo());
					System.out.println("Marca: ");
					System.out.println(carro.getMarca());
					System.out.println("Cor: ");
					System.out.println(carro.getCor());
					System.out.println("Chassi: ");
					System.out.println(carro.getChassi());
					System.out.println("Ano: ");
					System.out.println(carro.getAno());
					break;
				case 00:
					System.out.println("\n\nSaindo..\n");
					break;
				default:
					System.out.println("Opção incorreta.");
					break;
			}
		}while(op!=00);
		scan.close();
	}

}
