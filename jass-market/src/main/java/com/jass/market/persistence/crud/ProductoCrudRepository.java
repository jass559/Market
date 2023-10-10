package com.jass.market.persistence.crud;

import com.jass.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> FindByIdCategoriaOrderBynombreAsc(int idCategoria);
}
