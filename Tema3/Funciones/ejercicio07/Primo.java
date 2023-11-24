package ejercicio07;

public class Primo {

	public static boolean esPrimo(int n) {
		boolean primo = true;
		int div = 2;
		if (n == 1) {
			primo = false;
		} else {
			while (div <= Math.sqrt(n) && primo) {
				if (n % 2 == 0) {
					primo = false;
				}
				div++;
			}
		}

		return primo;
	}

}
