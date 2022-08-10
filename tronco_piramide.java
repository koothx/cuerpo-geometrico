package CuerposGeometricos;
import java.util.Scanner;
public class tronco_piramide {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Altura del T_piramide: ");
		double altura = lector.nextDouble();
		System.out.print("Lado base menor: ");
		double b = lector.nextDouble();
		System.out.print("Lado base mayor: ");
		double B = lector.nextDouble();
		
		double apotema = Math.sqrt(Math.pow(2, altura) - Math.pow(2,B/2 - b/2));
		double perimetro_b = b*4;
		double perimetro_B = B*4;
		
		double area_lateral = ((perimetro_B + perimetro_b)/2)*apotema; 
		double area_total = (area_lateral + B*B + b*b);
		double volumen = ((altura*(B*B + b*b + Math.sqrt(B*B + b*b)))/3);
		
		System.out.println("Area lateral: " + area_lateral +  " " + "u²");
		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
