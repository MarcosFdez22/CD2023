/**
 * La clase Estudiante representa a un estudiante con un nombre, edad y calificación.
 */
public class Estudiante {

    private String nombre; // Nombre del estudiante
    private int edad; // Edad del estudiante en meses
    private double calificacion; // Calificación del estudiante

    /**
     * Constructor de la clase Estudiante.
     *
     * @param nombre Nombre del estudiante.
     * @param edad   Edad del estudiante en meses.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece la calificación del estudiante.
     *
     * @param calificacion La calificación del estudiante.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param nombre El nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     *
     * @return La edad del estudiante en meses.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     *
     * @param edad La edad del estudiante en meses.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la calificación del estudiante.
     *
     * @return La calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Verifica si el estudiante aprobó o no.
     *
     * @return true si la calificación es mayor o igual a 5.0, de lo contrario false.
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Calcula la edad escolar del estudiante en años.
     *
     * @return La edad escolar del estudiante en años.
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Verifica si el estudiante es universitario.
     *
     * @return true si la edad del estudiante es mayor o igual a 18, de lo contrario false.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Imprime la información del estudiante en la consola.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}
