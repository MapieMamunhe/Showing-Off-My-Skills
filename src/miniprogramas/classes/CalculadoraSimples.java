package miniprogramas.classes;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import interfaces.InterfaceCalculadora;
import miniprogramas.excepcoes.OperacaoInvalidaException;

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
		double resultado = a*b;
		return resultado;
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
	public double divisao(double a, double b) throws OperacaoInvalidaException{
		if(b==0) {
			throw new OperacaoInvalidaException("Nao pode Ocorrer uma divisao por 0");
		}
		double resultado = a/b;
		return resultado;
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
	public String getMetodos() {
		StringBuilder lista = new StringBuilder();
		String listaMetodos;
		for(Method metodo : this.getClass().getMethods()) {
			if(!metodo.getDeclaringClass().equals(this.getClass())) {
				continue;
			}
			if(metodo.getName().equals("getMetodos")) {
				continue;
			}
			
			lista.append("Metodo: ");
			lista.append(metodo.getName());
			lista.append("\n");
			
			
			lista.append("Parametros: ");
			lista.append("(");
			for(Parameter parametro: metodo.getParameters()) {
				lista.append(parametro.getType().getSimpleName());
				lista.append(", ");
			}
			lista.append(")");
			lista.append("\n");
			
			lista.append("RETORNA: ");
			lista.append(metodo.getReturnType().getSimpleName());
			lista.append("\n===============================");
			lista.append("\n");
			
		}
		
		listaMetodos = lista.toString();
		return listaMetodos;
	}

}
