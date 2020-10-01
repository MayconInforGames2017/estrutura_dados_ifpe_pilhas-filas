package exercicios;

import java.util.Stack;

public class ConverterDecimalBinario {
	
	public static void main(String[] args) {
		imprimeResultado(2);
		imprimeResultado(4);
		imprimeResultado(10);
		imprimeResultado(35);
	}
	
	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binario é: " + decimalBinario(numero));
	}

	public static String decimalBinario(int numero) {
		
		Stack<Integer> pilha = new Stack<>();
		String numeroBinario = "";
		int resto;
		
		while (numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2;
		}
		
		while (!pilha.isEmpty()) {
			numeroBinario += pilha.pop();
		}
		
		return numeroBinario;
	}
	
}
