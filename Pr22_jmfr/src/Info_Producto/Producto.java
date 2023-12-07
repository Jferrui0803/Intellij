package Info_Producto;

public class Producto {


    private String codigo = "00";
    private String nombre = "producto 0";
    private double precio = 0;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;

    }

    public Producto(String codigo) {
        this.codigo = codigo;
    }

    public Producto(String codigo, String nombre, double precio) {
        this.codigo =  codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 10D;
    }
    
}
