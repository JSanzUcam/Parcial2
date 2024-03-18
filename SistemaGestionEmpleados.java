import java.util.Scanner;

public class SistemaGestionEmpleados {
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
