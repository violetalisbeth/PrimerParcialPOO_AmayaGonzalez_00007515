public class Laptop {
    private String nombre;
    private String modelo;
    private String descripcion;
    private Float precio;
    private String color;
    private String bateria;

    public Laptop(){}

    public Laptop(String nombre, String modelo, String descripcion, Float precio, String color, String bateria) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.color = color;
        this.bateria = bateria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Float getPrecio() {
        return precio;
    }
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBateria() {
        return bateria;
    }
    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
}

