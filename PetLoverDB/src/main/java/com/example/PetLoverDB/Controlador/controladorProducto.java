package com.veterinaria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.entidad.Producto;

@RestController
@RequestMapping("/productos")
public class ServicioProductoAPI {

    @Autowired
    private ServicioProducto servicioProducto;

    @GetMapping
    public List<Producto> listarProductos() {
        return servicioProducto.listarProductos();
    }

    @GetMapping("/{idProducto}")
    public Producto obtenerProductoPorId(@PathVariable int idProducto) {
        return servicioProducto.obtenerProductoPorId(idProducto);
    }

    @PostMapping
    public String agregarProducto(@RequestBody Producto producto) {
        return servicioProducto.agregarProducto(producto);
    }

    @PutMapping
    public String actualizarProducto(@RequestBody Producto producto) {
        return servicioProducto.actualizarProducto(producto);
    }

    @DeleteMapping("/{idProducto}")
    public String eliminarProducto(@PathVariable int idProducto) {
        return servicioProducto.eliminarProducto(idProducto);
    }
}