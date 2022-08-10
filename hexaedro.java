package CuerposGeometricos;
import java.util.Scanner;
public class hexaedro {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {

		System.out.print("Arista del Hexaedro: ");
		double a = lector.nextDouble();
	
		double area_lateral = 6*a*a - 2*a*a;
		double area_total = 6*a*a;
		double volumen = a*a*a;
		
		System.out.println("Area lateral: " + area_lateral +  " " + "u²");
		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
