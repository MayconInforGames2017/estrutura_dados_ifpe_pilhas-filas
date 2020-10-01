package exercicios;

import java.util.Stack;

public class DiamantesDeAreia {

	public static void main(String[] args) {
		
		String mineracao = "<..><.<..>>";
		int contDiamentes = 0;
		Stack<Character> pilha = new Stack<Character>();
	
		for (int i = 0; i < mineracao.length(); i++) {
			
			char caracter = mineracao.charAt(i);
			
			if (caracter == '<') {
				pilha.push(caracter);
			}
			else if (caracter == '>') {
				if(!pilha.isEmpty()) {
					pilha.pop();
					contDiamentes++;
				}
			}
			
		}
		
		System.out.println("Contador de Diamentes = " +contDiamentes);
	}
	
}
