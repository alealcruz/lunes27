/**
* Muestra por pantalla la frase ¡Hola mundo!
*
* @author alejandrolc
**/
public class HolaMundo {
	public static void main(String[] args) {
		String naranja = "\033[33m";
		String azul = "\033[34m";
	
		System.out.println(naranja + "¡Hola mundo!");
		System.out.println(azul + "Pruebas desde GIT en CLI");
	}
}
