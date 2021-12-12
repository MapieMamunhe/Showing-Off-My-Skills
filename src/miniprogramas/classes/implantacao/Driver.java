package miniprogramas.classes.implantacao;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import miniprogramas.excepcoes.OperacaoInvalidaException;
import java.util.HashMap;
import miniprogramas.classes.CalculadoraSimples;

public class Driver {

	public static void main(String[] args) throws IOException{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		HashMap <Integer, String> operacao = new HashMap<Integer, String>();
		boolean continuarOperacao = true;
		operacao.put(1, "soma");
		
		
		CalculadoraCommandLine calculadora = new CalculadoraCommandLine();
		double valor1, valor2;
		double valores[];
		System.out.println("-------------Seja Bem Vindo----------------");
		calculadora.menu();
		System.out.print("Escolha:");
		int escolha = Integer.parseInt(teclado.readLine());
		
		do {
			System.out.println("================================\n"
					+ "Digite um caracter para sair da operacao\n"
					+ "================================");
			try {
				valor1 = setValor((1),teclado);
				valor2 = setValor((2),teclado);
				calculadora.operacaoBasica(valor1,valor2,operacao.get(escolha));
			}catch(NumberFormatException e) {
				continuarOperacao = false;
			}
			
			
		}while(continuarOperacao);
		
		
		
		
	}
	
	public static double setValor(int posicao, BufferedReader t)throws IOException {
		System.out.print("Informe o "+posicao+"º valor: ");
		double valor = Double.parseDouble(t.readLine().replace(",", "."));//Adicionado tolerancia para virgulas e pontos
		return valor;
	}
	

}
