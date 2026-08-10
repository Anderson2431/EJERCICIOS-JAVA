public class Mascota {
    // Atributos
    String nombre;
    String especie;
    int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para imprimir la información
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
    }
}