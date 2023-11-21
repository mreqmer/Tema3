package ejercicio04;

public class Vocal {

	public static boolean vocal (char letra) {
	//regoge si la letra introducida es vocal o no
	boolean vocal=false;
	//si es una vocal true
	if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
		vocal = true;
	}
	
	return vocal;
	
	
	}
}
