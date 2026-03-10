package a00;

/**
 * Subclase Empleado: hereda de Persona.
 * Añade el atributo privado "salario".
 */
public class Empleado extends Persona {

    // Atributos privados: invisible desde fuera de la clase
    private double salario;

    // Constructor con super()
    public Empleado(int edad, String nombre, double estatura, String nacionalidad, double salario) {
        super(edad, nombre, estatura, nacionalidad);
        this.salario = salario;
    }

    // Método con overriding
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("\tSalario: " + getSalario()+" €");
    }

   // Método público que trabaja con los atributos privados
    public double calcularPagaExtra() {
        return salario;
    }

   // Método público que reutiliza get heredado de Persona
    public void subirSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100.0);
            System.out.println("Subida de un "+porcentaje+"%. Nuevo salario de "
                    + getNombre() + ": "+ salario + " €");
        }
    }

    // Método público que reutiliza el método heredado de Persona
    public boolean puedeTrabajar() {
        return esMayorDeEdad(); //se puede poner también super.
    }

    // Getter y Setter public: accesibles desde código externo
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}