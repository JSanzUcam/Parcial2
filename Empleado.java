/**
 * Clase empleado, incluye el nombre, salario y cargo del empleado
 */
class Empleado {
    /**
     * El nombre del empleado
     */
    private String nombre;
    /**
     * El cargo del empleado
     */
    private String cargo;
    /**
     * El salario del empleado
     */
    private double salario;

    /**
     * Constructor para esta clase, recibe un nombre, cargo y salario
     * 
     * @param nombre - String
     * @param cargo - String
     * @param salario - double
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /* Getters y Setters */
    /**
     * @return String - El nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Cambia el nombre del empleado por el que se especifique
     * @param nombre - String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String - El cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Cambia el cargo del empleado por el que se especifique
     * @param cargo - String
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return double - El salario del empleado
     */
    public double getSalario() {
        return salario;
    }
    /**
     * Cambia el salario del empleado por el que se especifique
     * @param salario - double
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Muestra el nombre de los atributos y sus valores en un String
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
