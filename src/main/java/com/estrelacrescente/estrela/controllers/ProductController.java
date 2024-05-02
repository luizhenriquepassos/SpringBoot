package com.estrelacrescente.estrela.controllers;

import com.estrelacrescente.estrela.model.entities.Product;
import com.estrelacrescente.estrela.model.repositories.PageRepository;
import com.estrelacrescente.estrela.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
   @Autowired
    private PageRepository pageRepository;

   @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product salverProduct(@Valid Product product){
        productRepository.save(product);
        return product;
   }
   // @PostMapping
   // public @ResponseBody Product newProduct(@Valid Product product){
   //  productRepository.save(product);
   //   return product;
   // }
    @GetMapping
    public Iterable<Product> getProduct(){
        return productRepository.findAll();
    }

    @GetMapping(path = "/name/{partName}")
    public Iterable<Product> getProductByName(@PathVariable String partName){
//      return pageRepository.findByNameContaining(partName);
        return  pageRepository.searchByNameLike(partName);
   }


    @GetMapping(path = "/page/{pageNumber}/{muchPage}")
    public Iterable<Product> getProductByPage(@PathVariable int pageNumber,  @PathVariable int muchPage){
        if(muchPage >= 2) muchPage =2;
        Pageable page = PageRequest.of(pageNumber,muchPage);
        return pageRepository.findAll(page);
    }
    @GetMapping(path="/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productRepository.findById(id);
    }

    //@PutMapping
    //public Product productAlter(@Valid Product product){
    //  productRepository.save(product);
    // return product;
    //}

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable int id){
        productRepository.deleteById(id);
    }
}
