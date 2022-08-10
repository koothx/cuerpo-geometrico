package CuerposGeometricos;
import java.util.Scanner;
public class dodecaedro {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Arista del dodecaedro: ");
		double a = lector.nextDouble();
		
		double area = 3*a*a*6.88190960;
		double volumen = 7.663118960*a*a*a;
		
		System.out.println("Area: " + area + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
