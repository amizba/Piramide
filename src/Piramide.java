/**
* Pintar una pirámide por pantalla, la altura y el carácter con el que se pinta se pide por teclado
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
		
		int alturaIntroducida = sc.nextInt();
		
		System.out.print("Introduzca el carácter de relleno: ");
		String relleno = sc.next();
		int planta = 1;
		int longitudDeLinea = 1;
		int espacios = alturaIntroducida-1;
		while (planta <= alturaIntroducida) {
		// inserta espacios
		for (int i = 1; i <= espacios; i++) {
		System.out.print(" ");

		}
		// pinta la línea
		for (int i = 1; i <= longitudDeLinea; i++) {
		System.out.print(relleno);
		}
		System.out.println();
		planta++;
		espacios--;
		longitudDeLinea += 2;
		}
		}
		


	}


