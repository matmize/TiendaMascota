package servlet;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int valorUni;
    private int cantidad; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValorUni() {
        return valorUni;
    }

    public void setValorUni(int valorUni) {
        this.valorUni = valorUni;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(int codigo, String nombre, String descripcion, int valorUni, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUni = valorUni;
        this.cantidad = cantidad;
    }
    
}
