package miniprogramas.classes;

import interfaces.InterfaceCalculadora;

public class CalculadoraSimples implements InterfaceCalculadora {

	/*
	 * Esse metodo somar b ao valor a e retornar o resultado
	 * */
	@Override
	public <E extends Number> E somar(E a, E b) {
		E resultado = a;
		
		return resultado;
	}

	/*
	 * Esse metodo somar b ao valor a e retornar o resultado
	 * */
	@Override
	public double somar(double a, double b) {
		return a+b;
	}

	/*
	 * Esse metodo somar b ao valor a e retornar o resultado
	 * */
	@Override
	public double somar(double[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Esse metodo somar b ao valor a e retornar o resultado
	 * */
	@Override
	public <E extends Number> E somar(E[] arr) {
		Number resultado = arr[0];
		
		return (E)resultado;
	}
	
	/*
	 * Esse metodo subtrai b do valor a e retornar o resultado
	 * */
	@Override
	public <E extends Number> E subtrair(E a, E b) {
		E resultado = a;
		
		return resultado;
	}

	@Override
	/*
	 * Esse metodo subtrai b do valor a e retornar o resultado
	 * */
	public double subtrair(double a, double b) {
		
		return a-b;
	}

	/*
	 * Esse metodo subtrai b do valor a e retornar o resultado
	 * */
	@Override
	public double subtrair(double[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Esse metodo subtrai b do valor a e retornar o resultado
	 * */
	@Override
	public <E extends Number> E subtrair(E[] arr) {
		Number resultado = arr[0];
		
		return (E)resultado;
	}

	/*
	 * Esse metodo multiplica a com b e retornar o resultado
	 * */
	@Override
	public <E extends Number> E multiplicacao(E a, E b) {
		E resultado = a;
		
		return resultado;
	}

	/*
	 * Esse metodo multiplica a com b e retornar o resultado
	 * */
	@Override
	public double multiplicacao(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Esse metodo multiplica a com b e retornar o resultado
	 * */
	@Override
	public double multiplicacao(double[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	/*
	 * Esse metodo multiplica a com b e retornar o resultado
	 * */
	@Override
	public <E extends Number> E multiplicacao(E[] arr) {
		Number resultado = arr[0];
		
		return (E)resultado;
	}

	/*
	 * Esse metodo divide a por b e retornar o resultado
	 * */
	@Override
	public <E extends Number> E divisao(E a, E b) {
		E resultado = a;
		
		return resultado;
	}

	/*
	 * Esse metodo divide a por b e retornar o resultado
	 * */
	@Override
	public double divisao(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Esse metodo divide a por b e retornar o resultado
	 * */
	@Override
	public double divisao(double[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Esse metodo divide a por b e retornar o resultado
	 * */
	@Override
	public <E extends Number> E divisao(E[] arr) {
		Number resultado = arr[0];
				
		return (E)resultado;
	}

}
