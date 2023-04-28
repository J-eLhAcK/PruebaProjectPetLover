package com.example.PetLoverDB.Servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.PetLoverDB.Entidad.Producto;

@Service
@Transactional
public class servicioProducto {

    @Autowired
    private RepositorioProducto repositorioProducto;

    public List<Producto> listarProductos() {
        return repositorioProducto.findAll();
    }

    public Producto obtenerProductoPorId(int idProducto) {
        return repositorioProducto.findById(idProducto).orElse(null);
    }

    public String agregarProducto(Producto producto) {
        try {
            repositorioProducto.save(producto);
            return "Producto agregado exitosamente.";
        } catch (Exception ex) {
            return "Error al agregar producto: " + ex.getMessage();
        }
    }

    public String actualizarProducto(Producto producto) {
        try {
            repositorioProducto.save(producto);
            return "Producto actualizado exitosamente.";
        } catch (Exception ex) {
            return "Error al actualizar producto: " + ex.getMessage();
        }
    }

    public String eliminarProducto(int idProducto) {
        try {
            repositorioProducto.deleteById(idProducto);
            return "Producto eliminado exitosamente.";
        } catch (Exception ex) {
            return "Error al eliminar producto: " + ex.getMessage();
        }
    }
}
