package CuerposGeometricos;
import java.util.Scanner;
public class octoedro {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("lado base del ortoedro: ");
		double a = lector.nextDouble();
		
		System.out.print("Ancho del ortoedro: ");
		double b = lector.nextDouble();
		
		System.out.print("altura del ortoedro: ");
		double c = lector.nextDouble();

		double area_total = 2*(a*b + a*c + b*c);
		double volumen = a*b*c;
		double D = Math.sqrt(a*a + b*b + c*c);

		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");
		System.out.println("Diagonal: " + D);
		

	}

}
