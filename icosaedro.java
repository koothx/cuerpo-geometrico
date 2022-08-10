package CuerposGeometricos;
import java.util.Scanner;
public class icosaedro {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Arista del icosaedro: ");
		double a = lector.nextDouble();
		
		double area = 8.660254037*a*a;
		double volumen = 2.18169499*a*a*a;
		
		System.out.println("Area: " + area + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
