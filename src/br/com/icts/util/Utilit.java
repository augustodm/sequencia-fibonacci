package br.com.icts.util;


public class Utilit {
	
	public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
	
	public static void pow(double base, double expoente) {
		double resultado = 0;
		for (int j2 = 0; j2 < expoente; j2++) {
			resultado = resultado * base;
		}
	}
	public static String treateNumber(double number) {
		return (number < 10) ? "0" + number : String.valueOf(number);
	}
	
	public static void printMat(double mat[][]) {
		System.out.println("                          Tabuada\n");
		System.out.println("      01    02    03    04    05    06    07    08    09    10\n");
		for (int i = 0; i < mat.length; i++) { //linha
			String line = Utilit.treateNumber(i + 1) + "  ";
			for (int j = 0; j < mat.length; j++) { //coluna
				line += " [" + Utilit.treateNumber(mat[i][j]) + "]" + " ";
			}
			System.out.println(line);
		}
	}
}
