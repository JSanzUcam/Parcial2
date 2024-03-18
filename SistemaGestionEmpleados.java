import java.util.Scanner;

/**
 * Clase principal. Incluye el método main
 */
public class SistemaGestionEmpleados {
    /**
     * Método main. Crea un objeto de la clase Empleados y
     * les sube el sueldo una cantidad calculada a partir 
     * de un pocentaje indicado por el usuario
     * 
     * @param args - String[] - Parámetros del programa
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.darDeAlta(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darDeAlta(new Empleado("María", "Diseñadora", 45000));
        empleados.darDeAlta(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Strings.PERCENTAGE_INPUT);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
