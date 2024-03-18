import java.util.ArrayList;

public class Empleados {
    private ArrayList<Empleado> lista;
    
    public Empleados() {
        lista = new ArrayList<>();
    }

    public void mostrarEmpleados() {
        System.out.println(Strings.EMPLOYEE_LIST_TITLE);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void darDeAlta(Empleado empleado) {
        lista.add(empleado);
    }
}
