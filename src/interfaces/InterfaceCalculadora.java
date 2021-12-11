package interfaces;

public interface InterfaceCalculadora {
	//Operacoes de soma
	public <E> double somar(E a, E b);
	public double somar(double a, double b);
	public double somar(double arr[]);
	public <E> double somar(E arr[]);
	
	//Operacoes de subtração
	public <E> double subtrair(E a, E b);
	public double subtrair(double a, double b);
	public double subtrair(double arr[]);
	public <E> double subtrair(E arr[]);
	
	//Operacoes de multiplicacao
	public <E> double multiplicacao(E a, E b);
	public double multiplicacao(double a, double b);
	public double multiplicacao(double arr[]);
	public <E> double multiplicacao(E arr[]);
	
	//Operacoes de divisao
	public <E> double divisao(E a, E b);
	public double divisao(double a, double b);
	public double divisao(double arr[]);
	public <E> double divisao(E arr[]);
	
}
