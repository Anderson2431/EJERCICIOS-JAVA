public class AppTelefono {
    public static void main(String[] args) {
        // 1. Crear un objeto de tipo Telefono con los datos de prueba
        Telefono miTelefono = new Telefono("Samsung", "A15", 250.0);

        // 2. Mostrar su información inicial
        System.out.println("--- INFORMACIÓN INICIAL ---");
        miTelefono.mostrarInfo();

        // 3. Probar un cambio de precio válido
        System.out.println("\n--- CAMBIO DE PRECIO VÁLIDO (220.0) ---");
        miTelefono.setPrecio(220.0);
        miTelefono.mostrarInfo();

        // 4. Probar un cambio de precio inválido (negativo)
        System.out.println("\n--- CAMBIO DE PRECIO INVÁLIDO (-50.0) ---");
        miTelefono.setPrecio(-50.0);
        miTelefono.mostrarInfo(); // El precio no debe cambiar

        // 5. Cambiar otros datos usando setters
        System.out.println("\n--- CAMBIO DE MARCA Y MODELO ---");
        miTelefono.setMarca("Xiaomi");
        miTelefono.setModelo("Redmi Note 13");
        miTelefono.mostrarInfo();
    }
}
