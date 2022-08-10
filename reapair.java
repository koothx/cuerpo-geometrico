package CuerposGeometricos;
import java.util.Scanner;
public class reapair {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Arista del octaedro: ");
		double a = lector.nextDouble();
	
		double area = 2*a*a*1.73;
		double volumen = 0.866025*a*a*a;
		
		System.out.println("Area : " + area + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
