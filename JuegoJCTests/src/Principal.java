import java.util.Scanner;

public class Principal {
	public static void main (String args[]) {
		///////////PREGUNTAS Y RESPUESTAS///////////////
		String Pregunta1="¿Cual es la capital de España?";
		String RespuestaCorrecta1="Madrid";
		String Pregunta2="¿Cual es la capital de Colombia";
		String RespuestaCorrecta2="Bogota";
		String Pregunta3="¿Cual es la capital de Venezuela ?";
		String RespuestaCorrecta3="Caracas";
		String Pregunta4="Cual es la capital de Italia";
		String RespuestaCorrecta4="Roma";
		String Pregunta5="Cual es la capital de Alemania";
		String RespuestaCorrecta5="Berlin";
		String Pregunta6="Cual es la capital de Rusia";
		String RespuestaCorrecta6="Moscu";
		String Pregunta7="Cual es la capital de Estados Unidos";
		String RespuestaCorrecta7="Washington";
		String Pregunta8="Cual es la capital de Inglaterra";
		String RespuestaCorrecta8="Londres";
		String Pregunta9="Cual es la capital de Cuba";
		String RespuestaCorrecta9="La Habana";
		String Pregunta10="Cual es la capital de Francia";
		String RespuestaCorrecta10="Paris";
		
		Scanner sc=new Scanner(System.in);

	
		/////////////////RESPUESTAS DEL USUARIO/////////////////
		String Respuesta1;
		String Respuesta2;
		String Respuesta3;
		String Respuesta4;
		String Respuesta5;
		String Respuesta6;
		String Respuesta7;
		String Respuesta8;
		String Respuesta9;
		String Respuesta10;
		
		
		/////////////////////////PUNTUACION//////////////////////////////////
		int aciertos = 0;
		int fallos = 0;
		
		
		///////////////////////////////////////////////////////JUEGO////////////////////////////////////////////////////////
		System.out.println("¡Bienvenido al juego de preguntas!, esta es la v1.0 del mismo, las preguntas seran acerca de capitales de distintos paises");
		
		//1//
		System.out.println("PRIMERA PREGUNTA");
		System.out.println(Pregunta1);
		Respuesta1=sc.nextLine();
		if (Respuesta1.equalsIgnoreCase(RespuestaCorrecta1)) {
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
			
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//2//
		System.out.println("SEGUNDA PREGUNTA");
		System.out.println(Pregunta2);
		Respuesta2=sc.nextLine();
		if (Respuesta2.equalsIgnoreCase(RespuestaCorrecta2)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//3//
		System.out.println("TERCERA PREGUNTA");
		System.out.println(Pregunta3);
		Respuesta3=sc.nextLine();
		if (Respuesta3.equalsIgnoreCase(RespuestaCorrecta3)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//4//
		System.out.println("CUARTA PREGUNTA");
		System.out.println(Pregunta4);
		Respuesta4=sc.nextLine();
		if (Respuesta4.equalsIgnoreCase(RespuestaCorrecta4)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//5//
		System.out.println("QUINTA PREGUNTA");
		System.out.println(Pregunta5);
		Respuesta5=sc.nextLine();
		if (Respuesta5.equalsIgnoreCase(RespuestaCorrecta5)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//6//
		System.out.println("SEXTA PREGUNTA");
		System.out.println(Pregunta6);
		Respuesta6=sc.nextLine();
		if (Respuesta6.equalsIgnoreCase(RespuestaCorrecta6)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//7//
		System.out.println("SEPTIMA PREGUNTA");
		System.out.println(Pregunta7);
		Respuesta7=sc.nextLine();
		if (Respuesta7.equalsIgnoreCase(RespuestaCorrecta7)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//8//
		System.out.println("OCTAVA PREGUNTA");
		System.out.println(Pregunta8);
		Respuesta8=sc.nextLine();
		if (Respuesta8.equalsIgnoreCase(RespuestaCorrecta8)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else { 
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//9//
		System.out.println("NOVENA PREGUNTA");
		System.out.println(Pregunta9);
		Respuesta9=sc.nextLine();
		if (Respuesta9.equalsIgnoreCase(RespuestaCorrecta9)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		//10//
		System.out.println("DECIMA PREGUNTA");
		System.out.println(Pregunta10);
		Respuesta10=sc.nextLine();
		if (Respuesta10.equalsIgnoreCase(RespuestaCorrecta10)){
			System.out.println("¡Respuesta Correcta!  +1 ");
			System.out.println("");
			aciertos++;
		}else {
			System.out.println("Has fallado... -1");
			System.out.println("");
			fallos++;
		}
		
		
		/////////////////////PUNTUACION/////////////////////
		System.out.println("************************************");
		System.out.println("Has acertado: "+aciertos+" veces");
		System.out.println("Has fallado: "+fallos+" veces");
		System.out.println("************************************");
		
		////////////////////MENSAJES SEGUN PUNTUACION////////////////////////
		if(aciertos<=3) {
			System.out.println("Parece que la geografia no es lo tuyo...");
		}else if(aciertos<=5){
			System.out.println("Se puede mejorar...");
		}else if(aciertos<=7){
			System.out.println("¡Estubo bien, pero te falta un poco para ser el mejor!");
		}else if(aciertos<=9){
			System.out.println("¡WOW!");
		}else if(aciertos==10){
			System.out.println("¡Ha sido increible!");
		
		}

	}
}
