import java.util.*;

public class ejercicio10{
	
	public static void main(String[] args){
		
		
		Scanner scanner = new Scanner(System.in);
		int multiplicar = 0;
		int acumuladorsuma = 0;
		int sumab = 0;
		while (acumuladorsuma<1000){
			int num, resta;
			System.out.println("Ingrese un numero: ");
			num = scanner.nextInt();
			
			acumuladorsuma = acumuladorsuma + num;
			resta = 1000 - acumuladorsuma;
			System.out.println("Disponible "+resta);
			
			if((num%6)==0){
				multiplicar = multiplicar + 1;
			}
			if (num>=1 && num<=10){
				
				sumab = sumab+num;
			}
		}
		
		System.out.println("a) La cantidad de numeros multiplos de 6 son: "+multiplicar);
		System.out.println("b) La suma entre 1 y 10 es: "+sumab);
		
	}
}