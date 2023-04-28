package com.example.PetLoverDB.Entidad;
import jakarta.persistence.*;


@Entity
@Table(name = "Productos")
public class Producto {

    @Id //Llave primaria
    @Column(unique = true, length = 20) //Este atrinuto es unico de la tabla
    private int IdProductos;
    @Column(nullable = false, length = 30)
    private String Nombre_Prod;
    @Column(nullable = false, length = 70)
    private String Descripcion_Prod;
    @Column(nullable = false) //Todos los datos son obligatorios
    private int Precio_Prod;

    public Producto() {
    }

    public Producto(int idProductos, String nombre_Prod, String descripcion_Prod, int precio_Prod) {
        IdProductos = idProductos;
        Nombre_Prod = nombre_Prod;
        Descripcion_Prod = descripcion_Prod;
        Precio_Prod = precio_Prod;
    }

    public int getIdProductos() {
        return IdProductos;
    }

    public void setIdProductos(int idProductos) {
        IdProductos = idProductos;
    }

    public String getNombre_Prod() {
        return Nombre_Prod;
    }

    public void setNombre_Prod(String nombre_Prod) {
        Nombre_Prod = nombre_Prod;
    }

    public String getDescripcion_Prod() {
        return Descripcion_Prod;
    }

    public void setDescripcion_Prod(String descripcion_Prod) {
        Descripcion_Prod = descripcion_Prod;
    }

    public int getPrecio_Prod() {
        return Precio_Prod;
    }

    public void setPrecio_Prod(int precio_Prod) {
        Precio_Prod = precio_Prod;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "IdProductos=" + IdProductos +
                ", Nombre_Prod='" + Nombre_Prod + '\'' +
                ", Descripcion_Prod='" + Descripcion_Prod + '\'' +
                ", Precio_Prod=" + Precio_Prod +
                '}';
    }
}
