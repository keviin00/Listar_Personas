package listarpersonas;

public class Alumno{
	
	private String Nombre,Apellido ;// estos son los parametros de los Alumnos

	  public  Alumno (String Nombre, String Apellido) { 
		this.Nombre = Nombre; // aca le estamos haciendo referencia al objeto definido como Nombre
		this.Apellido = Apellido; // aca le estamos haciendo referencia al objeto definido como Apellido
		
	}

	public String getNombre () { // aca estamos devolviendo el nombre de la Clase alumno
		return Nombre;
	}

	public void setnombre (String Nombre) {  // aca recibe el Nombre por parametro y despues lo asigna 
		
		this.Nombre = Nombre;
	}

	public String getApellido() { //aca estamos devolviendo el apellido de la Clase alumno
		return Apellido;
	}

	public void setapellido (String Apellido) { //aca recibe el apellido por parametro y despues lo asigna 
		
		this.Apellido = Apellido;
	}
	public String toString() { // con este metodo se va a imprimir lo declarado en el for
		return "Alumno{" + "Nombre=" + Nombre + ",Apellido=" + Apellido + '}' + "\n"; // alfinal tiene un salto de linea asi puede imprimir uno bajo del otro 

	}

}
	



