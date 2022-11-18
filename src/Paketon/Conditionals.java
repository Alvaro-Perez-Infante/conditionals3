package Paketon;

import java.util.Scanner;

public class Conditionals {

public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in); 
		
		
		
		int diaSemana;
		String dia = null;
		
		
		System.out.print("Introduzca el número del dia de la semana [1-7]:" );
		diaSemana = Integer.parseInt(teclado.nextLine());
		
		switch(diaSemana) {
		case 1: dia = "Lunes"; break;
		case 2: dia = "Martes"; break;
		case 3: dia = "Miércoles"; break;
		case 4: dia = "Jueves"; break;
		case 5: dia = "Viernes"; break;
		case 6: dia = "Sábado"; break;
		case 7: dia = "Domingo"; break;
		}
		
		System.out.println("El día: " + diaSemana + " es " + dia);
}
}