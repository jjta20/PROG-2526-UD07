package a00;

/**
 * Subclase de Empleado: tercer nivel de herencia.
 * Un Directivo es un Empleado y por tanto también es una Persona.
 * Añade los atributos privados : departamento y bonus anual.
 */
public class Directivo extends Empleado {

    private String departamento;
    private double bonus;

    //Constructor
    public Directivo(int edad, String nombre, double estatura,
                     String nacionalidad, double salario,
                     String departamento, double bonus) {
        super(edad, nombre, estatura, nacionalidad, salario);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    // // Método con overriding (tercer nivel)
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("\tDepartamento: " + departamento);
        System.out.println("\tBonus anual: "+bonus+" €");
    }

    // Método público que trabaja con los atributos privados
    public double retribucionAnual() {
        return getSalario() * 12 + bonus;
    }

   // // Método con overriding (tercer nivel)
    @Override
    public double calcularPagaExtra() {
        return super.calcularPagaExtra() * 1.1;
    }

    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }
    public double getBonus() {
        return bonus;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}