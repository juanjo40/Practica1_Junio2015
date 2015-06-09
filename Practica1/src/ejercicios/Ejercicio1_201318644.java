package ejercicios;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ejercicio1_201318644 {
	public void metodo1(){
		System.out.println("Opcion1");
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss+1");
		System.out.println("Hora: "+hourFormat.format(date));
	}
}
