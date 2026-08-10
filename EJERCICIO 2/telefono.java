public class Telefono {
    // Atributos privados
    private String marca;
    private String modelo;
    private double precio;

    // Constructor para inicializar los datos
    public Telefono(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        setPrecio(precio); // Usamos el setter para validar desde el inicio
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo. No se realizaron cambios.");
        }
    }

    // Método para imprimir la información
    public void mostrarInfo() {
        System.out.println("Teléfono -> Marca: " + marca + " | Modelo: " + modelo + " | Precio: $" + precio);
    }
}