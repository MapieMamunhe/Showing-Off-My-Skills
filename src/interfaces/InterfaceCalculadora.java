package interfaces;

import miniprogramas.excepcoes.OperacaoInvalidaException;

public interface InterfaceCalculadora {
	//Operacoes de soma
	public <E extends Number> E somar(E a, E b);
	public double somar(double a, double b);
	public double somar(double arr[]);
	public <E extends Number> E somar(E arr[]);
	
	//Operacoes de subtração
	public <E extends Number> E subtrair(E a, E b);
	public double subtrair(double a, double b);
	public double subtrair(double arr[]);
	public <E extends Number>  E subtrair(E arr[]);
	
	//Operacoes de multiplicacao
	public <E extends Number> E multiplicacao(E a, E b);
	public double multiplicacao(double a, double b);
	public double multiplicacao(double arr[]);
	public <E extends Number>  E multiplicacao(E arr[]);
	
	//Operacoes de divisao
	public <E extends Number> E divisao(E a, E b)throws OperacaoInvalidaException;
	public double divisao(double a, double b)throws OperacaoInvalidaException;
	public double divisao(double arr[])throws OperacaoInvalidaException;
	public <E extends Number> E divisao(E arr[])throws OperacaoInvalidaException;
	
}
