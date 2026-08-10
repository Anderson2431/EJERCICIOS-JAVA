public class App {
    public static void main(String[] args) {
        // Creación de dos objetos de tipo Mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2);

        // Mostrar en consola la información de las dos mascotas
        System.out.println("--- Información de Mascotas ---");
        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
    }
}