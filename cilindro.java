package CuerposGeometricos;
import java.util.Scanner;
public class cilindro {
	static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		double altura, radio, areaLateral, areaBase, areaTotal, volumen;
		
		System.out.println("ingrese la altura: ");
		altura = lector.nextDouble();
		System.out.println("ingrese el radio: ");
		radio = lector.nextDouble();
		
		areaLateral = 2 * Math.PI * radio * altura;
		areaBase = Math.PI * radio * radio;
		areaTotal = areaLateral *2 *areaBase;
		volumen = areaBase * altura;
		
		System.out.println("El valor del area lateral es: " + areaLateral );
		System.out.println("El valor de area total es: " + areaTotal );
		System.out.println("El valor del volumen es: " + volumen );

	}

}
