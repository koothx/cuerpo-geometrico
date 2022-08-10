package CuerposGeometricos;
import java.util.Scanner;
public class esfera {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {

		System.out.print("Radio: ");
		double Radio = lector.nextDouble();
		double pi = 3.141516;
		
		double area = (4*pi*Radio*Radio);
		double volumen = (4*pi*Radio*Radio*Radio)/3;

		System.out.println("Area : " + area +  " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");
		
		System.out.println("Areas sencillas :");
		
		System.out.println("Areas especiales");
		System.out.println("Zona esferica");
		
		System.out.println("Casquete esferico");
		System.out.println("Recuerde que tiene ingresar una altura");
		System.out.println("menor a la del radio ");
		System.out.println("De lo contrario el dato resultante no tendra logica");
		
		System.out.print("Radio menor: ");
		double r = lector.nextDouble();
		System.out.print("Radio Mayor: ");
		double R = lector.nextDouble();
		System.out.print("Altura: ");
		double h = lector.nextDouble();
		
		double zona_esferica_area =  2*pi*Radio*h;
		double zona_esferica_volumen = (pi*h*(Math.pow(2, h) + 3*Math.pow(2, R) + 3*Math.pow(2, r)))/6;
		System.out.println("Area zona esferica: " + zona_esferica_area + " " + "u²");
		System.out.println("Volumen zona esferica: " + zona_esferica_volumen + " " + "u²");
		System.out.println("Casquete esferico");
		System.out.println("Recuerde que tiene ingresar una altura");
		System.out.println("menor a la del radio ");
		System.out.println("De lo contrario el dato resultante no tendra logica");

		
		System.out.print("Altura casquete esferico: ");
		double h2 = lector.nextDouble();
		double casquete_esferico_volumen = 3*pi*(3*Radio - h2);
		double casquete_esferico_area = 2* Radio*h2;
		System.out.println("Area Casquete esferico: " + casquete_esferico_area + " " + "u²");
		System.out.println("Volumen Casquete esferico: " + casquete_esferico_volumen + " " + "u³");

	}

}
