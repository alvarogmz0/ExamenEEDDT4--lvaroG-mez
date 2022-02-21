package Ejercicio6;

public class ejercicio6 {

	public static void main(String[] args) {

		sumaNuevo(new sumaNuevo(5, 10));
	}

	private static int sumaNuevo(sumaNuevo parameterObject) {

		int sumatorio = parameterObject.getA() + parameterObject.getB();
		System.out.println(sumatorio);
		return 0;
	}
}
