import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float fAltura, fPeso, fIMC;
		
		System.out.println("Bienvenido a la clinica de adelgazamiento.");
		System.out.println("");
		System.out.println("A continuación deberá suministrar sus datos para calcular su IMC.");
		System.out.println("");
		
		System.out.println("Introduzca su peso en Kg");
		fPeso = entrada.nextFloat();
		System.out.println("");
		
		System.out.println("Introduzca su altura metros");
		fAltura = entrada.nextFloat();
		System.out.println("");
		
		
		fIMC = fPeso/(fAltura*fAltura);
	
		
		if (fIMC < 18.5)
		{
			System.out.printf("El cliente de " + fPeso + "kg y " + fAltura + " m tiene un IMC de ");
			System.out.printf("%.2f", fIMC );
			System.out.printf(". Y su diagnóstico es que se encuentra usted en un bajo peso.");
		}
		else if ((fIMC > 18.5) && (fIMC < 24.9))
		{
			System.out.printf("El cliente de " + fPeso + "kg y " + fAltura + " m tiene un IMC de ");
			System.out.printf("%.2f", fIMC );
			System.out.printf(". Y su diagnóstico es que se encuentra usted en un peso normal(saludable).");
		}
		else if ((fIMC > 25) && (fIMC < 29.9))
		{
			System.out.printf("El cliente de " + fPeso + "kg y " + fAltura + " m tiene un IMC de ");
			System.out.printf("%.2f", fIMC );
			System.out.printf(". Y su diagnóstico es que sufre sobrepeso.");
		}
		else if ((fIMC > 30) && (fIMC < 40))
		{
			System.out.printf("El cliente de " + fPeso + "kg y " + fAltura + " m tiene un IMC de ");
			System.out.printf("%.2f", fIMC );
			System.out.printf(". Y su diagnóstico es que sufre de obesidad premórbida.");
		}
		else if (fIMC > 40)
		{
			System.out.printf("El cliente de " + fPeso + "kg y " + fAltura + " m tiene un IMC de ");
			System.out.printf("%.2f", fIMC );
			System.out.printf(". Y su diagnóstico es que sufre de obesidad mórbida.");
		}
	}
}