package listarpersonas;


import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ListarPersonasAyalaKevin {
	


	public static void main(String[] args) {
		Alumno a1 = new Alumno("Kevin","Ayala"); // creamos el objeto de tipo Alumno  , como parametro va el nombre y apellido
		Alumno a2 = new Alumno("Michel","Nostradame");// creamos el objeto de tipo Alumno  , como parametro va el nombre y apellido
		Alumno a3 = new Alumno("flautista","Hamelín");// creamos el objeto de tipo Alumno  , como parametro va el nombre y apellido
		Alumno a4 = new Alumno("Daemon ","Spade");// creamos el objeto de tipo Alumno  , como parametro va el nombre y apellido
		Alumno a5 = new Alumno("Mukuro","Rokudo");// creamos el objeto de tipo Alumno , como parametro va el nombre y apellido
		
		
		List<Alumno> alumnos = new ArrayList<Alumno>  (); // creamos el objeto de tipo list donde almacena objetos de tipo alumnos, se le añade un obejeto del arraylist
		
	alumnos.add(a1); // aca ya podemos añadir los elementos a la lista
	alumnos.add(a2); // aca ya podemos añadir los elementos a la lista
	alumnos.add(a3); // aca ya podemos añadir los elementos a la lista
	alumnos.add(a4); // aca ya podemos añadir los elementos a la lista
	alumnos.add(a5); // aca ya podemos añadir los elementos a la lista
	
	System.out.println("por Nombre");
	alumnos.sort(Comparator.comparing(Alumno::getNombre));
	alumnos.forEach((n) -> print(n));
	
	System.out.println("Apellido");
	alumnos.sort(Comparator.comparing(Alumno::getApellido));
	alumnos.forEach((n) -> print(n));
	}
	public static void print(Alumno n) {

		System.out.println(n);

	}
		}
	
	
