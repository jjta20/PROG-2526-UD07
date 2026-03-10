package a00;

import java.io.PrintStream;

/**
 *  SELECCIÓN DINÁMICA DE MÉTODOS:
 *  En Java, cuando una variable de tipo Persona apunta a un objeto
 *  Empleado, Cliente o Directivo, la JVM decide EN TIEMPO DE EJECUCIÓN
 *  qué versión de mostrarDatos() invocar, basándose en el tipo REAL del
 *  objeto, no en el tipo declarado de la variable.
 *
 *  Esto es el POLIMORFSIMO en acción: el mismo código (el bucle de abajo)
 *  produce comportamientos distintos sin ningún if/switch.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        // 1. Creación de objetos
        System.out.println("\n\n1. Creación de objetos.");
        Persona  p = new Persona (30,"Ana García",1.65,"Española");
        Empleado e = new Empleado(45,"Luis Pérez",1.80,"Mexicana",2800.0);
        Cliente  c = new Cliente (28,"Marta López",1.70,"Argentina",1500.0);
        Directivo d = new Directivo(52,"Carlos Ruiz",1.75,"Español",5000.0,"Tecnología",12000.0);

        // 2. Selección dinámica de métodos
        // polimorfismo: distintos tipos en array de Persona[]
        System.out.println("\n\n2. Selección dinámica de métodos:");
        
        Persona[] personas = { p, e, c, d };

        for (Persona persona : personas) {
            persona.mostrarDatos();
            System.out.println("\tMayor de edad: " + persona.esMayorDeEdad()+"\n");
        }

        // 3. Métodos específicos de cada subclase
        System.out.println("\n\n3. Métodos específicos de cada subclase");

        // Empleado
        System.out.println("\n── Empleado ──");
        System.out.println("\t¿Puede trabajar?: " + e.puedeTrabajar());
        System.out.println("\tPaga extra: " + e.calcularPagaExtra() + " €");
        e.subirSalario(10); // subida del 10 %
        e.mostrarDatos();

        // Cliente
        System.out.println("\n── Cliente ──");
        c.comprar("Portátil",1200.0);
        c.comprar("Televisor",500.0);   // no tendrá suficiente
        c.mostrarDatos();

        // Directivo
        System.out.println("\n── Directivo ──");
        d.mostrarDatos();
        System.out.println("\tRetribución total anual (con bonus): "+d.retribucionAnual()+" €");
        System.out.println("\tPaga extra: "+d.calcularPagaExtra()+" €");
    }
}