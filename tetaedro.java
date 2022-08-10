package CuerposGeometricos;
import java.util.Scanner;
public class tetaedro {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Arista del tetraedro: ");
		double a = lector.nextDouble();
	
		double area_lateral = 3*((a*Math.sqrt(a*a - a/2*a/2))/2);
		double area_total = 4*((a*Math.sqrt(a*a - a/2*a/2))/2);
		double volumen = (Math.sqrt(2)/12)*a*a*a;
		
		System.out.println("Area lateral: " + area_lateral +  " " + "u²");
		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");


	}

}
