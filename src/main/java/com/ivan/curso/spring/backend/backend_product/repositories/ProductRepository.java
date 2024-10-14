package com.ivan.curso.spring.backend.backend_product.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ivan.curso.spring.backend.backend_product.entities.Product;

@CrossOrigin(origins = "http://localhost:5174/")
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
