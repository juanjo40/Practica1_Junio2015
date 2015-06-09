package ejercicios;
import java.util.Scanner;
public class Principal_201318644 {

	public static void main(String[] args) {
		int opcion;
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Bienvenido a la práctica1\n Elija el ejercicio a probar");
		opcion=s.nextInt();
	
		switch(opcion){
		case 1:
			Ejercicio1_201318644 metodo = new Ejercicio1_201318644();
			metodo.metodo1();
			break;
		case 2:
			Ejercicio2_201318644 metodo2 = new Ejercicio2_201318644();
			metodo2.metodo2();
			break;
		case 3:
			Ejercicio3_201318644 metodo3 = new Ejercicio3_201318644();
			metodo3.metodo3();
			break;
		case 4:
			Ejercicio4_201318644 metodo4 = new Ejercicio4_201318644();
			metodo4.metodo4();
			break;
		case 5:
			Ejercicio5_201318644 metodo5 = new Ejercicio5_201318644();
			metodo5.metodo5();
			break;
		case 6:
			Ejercicio6_201318644 metodo6 = new Ejercicio6_201318644();
			metodo6.metodo6();
			break;
		case 7:
			Ejercicio7_201318644 metodo7 = new Ejercicio7_201318644();
			metodo7.metodo7();
			break;
		case 8:
			Ejercicio8_201318644 metodo8 = new Ejercicio8_201318644();
			metodo8.metodo8();
			break;
		case 9:
			Ejercicio9_201318644 metodo9 = new Ejercicio9_201318644();
			metodo9.metodo9();
			break;
		case 10:
			Ejercicio10_201318644 metodo10 = new Ejercicio10_201318644();
			metodo10.metodo10();
			break;
		default:
		
			System.out.println("Elija solo entre las 10 opciones ");
			
		}
		

	}

}
