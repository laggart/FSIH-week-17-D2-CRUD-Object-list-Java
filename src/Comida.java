public class Comida {
    private String nombre;
    private String origen;
    private double peso;
    private double precio;

    

    public Comida(String nombre, String origen, double peso, double precio) {
        this.nombre = nombre;
        this.origen = origen;
        this.peso = peso;
        this.precio = precio;
    }

    public Comida() {
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", origen='" + getOrigen() + "'" +
            ", peso='" + getPeso() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
    
}
