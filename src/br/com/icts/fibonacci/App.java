package br.com.icts.fibonacci;

import br.com.icts.util.Utilit;

public class App {
	public static void main(String[] args) {
		for (int i = 0; i < 17; i++) {
            System.out.println("(" + i + "):" + Utilit.fibo(i)+ "\t");
        }
	}
}
