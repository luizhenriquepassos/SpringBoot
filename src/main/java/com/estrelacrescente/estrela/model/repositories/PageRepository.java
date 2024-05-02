package com.estrelacrescente.estrela.model.repositories;

import com.estrelacrescente.estrela.model.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PageRepository extends PagingAndSortingRepository<Product, Integer> {

    public Iterable<Product> findByNameContaining(String partName);
    public Iterable<Product> searchByNameLike (@Param("name")String name);
}
