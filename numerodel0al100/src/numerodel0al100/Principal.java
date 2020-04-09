package numerodel0al100;

import java.util.Scanner;

public class Principal {
static double random;
static Integer pregunta;
static Integer respuesta =-1 ;
private static Scanner sc;
public static void main(String[] args) {
	sc = new Scanner(System.in);
	random = Math.random()*100;
	numero1 numero = new numero1(random);
	pregunta = numero.getnumero();	
		do {
			System.out.println("Dame tu respuesta, para una pista pon -0");			
			respuesta = sc.nextInt();
			if(respuesta.equals(-0)) {
				System.out.println("tu numero esta entre "+(pregunta-3)+" y "+(pregunta +3));
			}else {
				boolean Result = respuesta.equals(pregunta);
				
				if(Result) {
					System.out.println("has acertado");
				}else {
					System.out.println("has fallado");
				}
			}
			
		}while(!respuesta.equals(pregunta));
	}
}
