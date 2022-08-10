package CuerposGeometricos;
import java.util.Scanner;
public class tronco_cono {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Altura del T_cono: ");
		double altura = lector.nextDouble();
		System.out.print("Radio menor del T_cono: ");
		double r = lector.nextDouble();
		System.out.print("Radio mayor T_cono: ");
		double R = lector.nextDouble();
	
		double generatriz = Math.sqrt(Math.pow(2, altura) + Math.pow(2,(R - r)));
		double pi = 3.141516;
		double Ab = pi * Math.pow(2,R);
		double AB = pi * Math.pow(2,r);
		
		double area_lateral = pi*generatriz*(R + r);
		double area_total = area_lateral + Ab + AB;
		double volumen = (pi*altura*(Math.pow(2,R) + Math.pow(2,r) + R*r))/3;
		
		System.out.println("Area lateral: " + area_lateral +  " " + "u²");
		System.out.println("Area total: " + area_total + " " + "u²");
		System.out.println("Volumen: " + volumen + " " + "u³");

	}

}
