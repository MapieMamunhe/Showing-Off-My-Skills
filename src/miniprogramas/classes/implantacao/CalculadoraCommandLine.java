package miniprogramas.classes.implantacao;
import interfaces.InterfaceImplantacao;
import miniprogramas.classes.CalculadoraSimples;
public class CalculadoraCommandLine implements InterfaceImplantacao{

	private CalculadoraSimples cs = new CalculadoraSimples();
	@Override
	public void menu() {
		System.out.println("1-Soma"
				+ "\n2-Subtracao"
				+ "\n3-Divisao"
				+ "\n4-Multiplicacao:"
				+ "\n");
	}
	public void operacaoBasica(double a, double b, String operacao) {
		switch(operacao) {
		case "soma":
			System.out.printf("A Soma :%.3f\n",cs.somar(a, b));
			break;
		}
	}
	
}
