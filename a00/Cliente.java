package a00;

/**
 * Subclase Cliente: hereda de Persona.
 * Añade el atributo privado "presupuesto".
 * mostrarDatos() muestra TODOS los atributos heredados más el propio.
 */
public class Cliente extends Persona {

    // Atributo privados: invisible desde fuera de la clase
    private double presupuesto;

    // Constructor
    public Cliente(int edad, String nombre, double estatura, String nacionalidad, double presupuesto) {
        super(edad, nombre, estatura, nacionalidad);
        this.presupuesto = presupuesto;
    }

    // Método con overriding
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("\tPresupuesto: " + getPresupuesto() + " €");
    }

    // Método público que trabaja con los atributos privados
    public boolean puedeComprar(double precio) {
        return presupuesto >= precio;
    }

    // Método público que trabaja con los atributos privados
    public void comprar(String articulo, double precio) {
        if (puedeComprar(precio)) {
            presupuesto -= precio;
            System.out.println(getNombre() + " ha comprado '" + articulo +
                    "' (" + precio + " €). Saldo restante: " + presupuesto + " €");

        } else {
            System.out.println(getNombre() + " no tiene presupuesto suficiente para '"
                    + articulo + "' (" + precio + " €)");
        }
    }

    // Getter y Setter
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}