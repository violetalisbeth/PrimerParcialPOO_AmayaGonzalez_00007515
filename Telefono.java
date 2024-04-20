public class Telefono {
    private String nombre;
    private String modelo;
    private String descripcion;
    private float precio;
    private String compania ;
    private String accesorio;

    public Telefono(){}

    public Telefono(String nombre, String modelo, String descripcion, float precio, String compania, String accesorio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.compania = compania;
        this.accesorio = accesorio;
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
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getCompania() {
        return compania;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
    public String getAccesorio() {
        return accesorio;
    }
    public void setAccesorio(String accesorio) {
        this.accesorio = accesorio;
    }
}
