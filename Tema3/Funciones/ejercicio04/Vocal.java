package ejercicio04;

public class Vocal {

	public static boolean vocal (char letra) {
	//regoge si la letra introducida es vocal o no
	boolean vocal=false;
	//si es una vocal true
	if (letra=='a' ||letra=='A' || letra=='e' ||letra=='E' || letra=='i' ||letra=='I' || letra=='o' || letra=='O' || letra=='u' || letra=='U') {
		vocal = true;
	}
	
	return vocal;
	
	
	}
}
