package com.example.PetLoverDB.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.PetLoverDB.Entidad.Producto;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Integer> {

}