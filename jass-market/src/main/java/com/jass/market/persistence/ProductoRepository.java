package com.jass.market.persistence;

import com.jass.market.persistence.crud.ProductoCrudRepository;
import com.jass.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productocrudRepository;


    //obtener todos los productos
    public List<Producto> getAll(){

        return (List<Producto>) productocrudRepository.findAll();
    }
    public List<Producto> obtenerTodo(int idCategoria){
        return productocrudRepository.FindByIdCategoriaOrderBynombreAsc( idCategoria);
    }
}
