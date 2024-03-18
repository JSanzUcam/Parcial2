import java.util.ArrayList;

/**
 * Hace la gestión de los empleados
 */
public class Empleados {
    /**
     * ArrayList que contiene a los empleados. Es un ArrayList para poder añadir
     * de forma dinámica más empleados.
     */
    private ArrayList<Empleado> lista;
    
    /**
     * Constructor, inicializa el atributo lista
     */
    public Empleados() {
        lista = new ArrayList<>();
    }

    /**
     * Muestra todos los empleados registrados en la lista
     */
    public void mostrarEmpleados() {
        System.out.println(Strings.EMPLOYEE_LIST_TITLE);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Recibe un porcentaje y lo usa para aumentar el salario de todos los 
     * empleados
     * 
     * @param porcentaje - double - El porcentaje del salario que se va a añadir
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Añade un empleado a la lista de empleados
     * 
     * @param empleado - Empleado
     */
    public void darDeAlta(Empleado empleado) {
        lista.add(empleado);
    }
}
