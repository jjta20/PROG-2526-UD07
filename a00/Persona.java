package a00;

/**
 * (A00) Superclase Persona
 * Los atributos son privados: solo esta clase puede acceder directamente.
 * Las subclases deben usar los getters/setters protegidos.
 * 
 * Persona
 * ├── Empleado
 * │   └── Directivo ← subclase de subclase
 * └── Cliente
 */
public class Persona {

    // Atributos privados: invisible desde fuera de la clase
    private int edad;
    private String nombre;
    private double estatura;
    private String nacionalidad;

    // Constructor
    public Persona(int edad, String nombre, double estatura, String nacionalidad) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }
    
    // Método
    public void mostrarDatos() {
        System.out.println("\tNombre: " + getNombre());
        System.out.println("\tEdad: " + getEdad() + " años");
        System.out.println("\tEstatura: " + getEstatura() + " m");
        System.out.println("\tNacionalidad: " + getNacionalidad());
    }

    // Método público que trabaja con los atributos privados
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Getters y Setters protected: solo accesibles desde subclases

    // Getters
    protected int getEdad() {
        return edad;
    }
    protected String getNombre() {
        return nombre;
    }        
    protected double getEstatura() {
        return estatura;
    }
     protected String getNacionalidad() {
        return nacionalidad;
    }
    
    // Setters
    protected void setEdad(int edad) {
        this.edad = edad;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    protected void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }    

}