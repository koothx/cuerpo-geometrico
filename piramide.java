package CuerposGeometricos;
import java.util.Scanner;
public class piramide {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Altura de piramide: ");
		double altura = lector.nextDouble();
		System.out.print("Lado de la piramide(base): ");
		double lado = lector.nextDouble();

		double radio = lado/2; 
		double Ap = Math.sqrt(altura*altura + radio*radio);
		
		double area_lateral = (4*lado * Ap)/2;
		double area_total = (area_lateral + lado*lado);
		double volumen = (lado*lado*altura)/3;
		
		System.out.println("Area lateral: " + area_lateral +  " " + "u²");
		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
