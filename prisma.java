package CuerposGeometricos;
import java.util.Scanner;
public class prisma {
	static Scanner  lector = new Scanner (System.in);
	
	public static void main(String[] args) {
		int numeroLado;
		double areaLateral, altura, areaBase, longLados, alfa, perimetro;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("ingrese el valor de la altura: ");
		altura = lector.nextDouble();
		System.out.println("ingrese la longitud de los lados: ");
		longLados = lector.nextDouble();
		System.out.println("ingrese el numero de lados: ");
		numeroLado = lector.nextInt();
		
		perimetro = numeroLado * longLados;
		areaLateral = perimetro * altura;
		System.out.println("El perimetro es: " + perimetro);
		System.out.println("El area lateral del prsima es: " + areaLateral);

	}

}
