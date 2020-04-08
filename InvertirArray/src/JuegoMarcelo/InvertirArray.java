package JuegoMarcelo;

import java.util.Scanner;
public class InvertirArray {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] invertido;
	int[] numeros;
	int tamano;
	
	System.out.print("Dame el tamaño del array: ");
	tamano=sc.nextInt();
	sc.hasNextLine();
	System.out.println();
	numeros= new int[tamano];
	invertido= new int[tamano];
	
	for(int i=0; i<tamano;i++) {
		System.out.print("Dame el "+(i+1)+"º numero:" );
		numeros[i]=sc.nextInt();
		sc.nextLine();
		System.out.println();
	}
	sc.close();
	System.out.println("Numeros sin invertir: ");
	for(int numero:numeros) {
		System.out.print(numero+", ");
	}
	System.out.println();	
	
	for(int i=0;i<tamano;i++) {
		invertido[i]=numeros[(tamano-1)-i];
	}
		
	System.out.println("Numeros invertidos: ");	
	
	for(int numero:invertido) {
		System.out.print(numero+", ");
	}
	System.out.println();
	
	}
}

