package com.unifil.kawan.api_rest_facul.controller;

import com.unifil.kawan.api_rest_facul.model.Product;
import com.unifil.kawan.api_rest_facul.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping
    public List<Product> listAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }
}
