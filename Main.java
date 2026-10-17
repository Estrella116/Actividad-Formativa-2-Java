
public class Main {

    // Clase que representa a un estudiante
    static class Estudiante {

        // Atributos
        private String nombre;
        private int edad;

        // Constructor
        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Metodo para mostrar los datos
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }

        // Metodo para verificar la edad
        public void verificarEdad() {
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }
        }
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Crear objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Carlos", 20);
        Estudiante estudiante2 = new Estudiante("Maria", 16);

        // Mostrar los datos del primer estudiante
        System.out.println("ESTUDIANTE 1");
        estudiante1.mostrarDatos();
        estudiante1.verificarEdad();

        System.out.println();

        // Mostrar los datos del segundo estudiante
        System.out.println("ESTUDIANTE 2");
        estudiante2.mostrarDatos();
        estudiante2.verificarEdad();
    }
}