package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancoParenteses {

	public static boolean checarParenteses(String str) {
		int len = str.length(), cont = 0;
		char c;
		boolean abrirFechar = true;
		for (int i = 0; i < len; i++) {
			c = str.charAt(i);
			if (c == '(') {
				cont++;
			} else if (c == ')' && cont > 0) {
				cont--;
			} else if (c == ')' && cont <= 0) {
				abrirFechar = false;
				cont--;
			}
		}
		if (cont == 0 && abrirFechar) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = s.readLine()) != null) {
			if (checarParenteses(str)) {
				System.out.println("corret");
			}
			else {
				System.out.println("incorret");
			}
		}
	}
	
}
