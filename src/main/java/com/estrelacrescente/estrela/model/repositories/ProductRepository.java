package com.estrelacrescente.estrela.model.repositories;

import com.estrelacrescente.estrela.model.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ProductRepository extends CrudRepository<Product, Integer> {

    /*
        findByNameContaining
        findByNameIsContaining
        findByNameContains

        findByNameStartsWith
        findByNameEndsWith

        FindByNameNotContaining
    */


}
