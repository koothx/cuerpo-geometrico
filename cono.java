package CuerposGeometricos;
import java.util.Scanner;
public class cono {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Calculo de areas y volumen de cono");
		System.out.print("Altura del cono: ");
		double altura = lector.nextDouble();
		
		System.out.print("Radio del cono(base): ");
		double radio = lector.nextDouble();
		double generatriz = Math.sqrt(radio*radio + altura*altura);
		double pi = 3.141516;
		
		double area_lateral = (pi*radio*generatriz);
		double area_total = (pi*radio*(generatriz + radio));
		double volumen = (pi*radio*radio*altura)/3;
		
		System.out.println("Area lateral: " + area_lateral +  " " + "u²");
		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");
		

	}

}
