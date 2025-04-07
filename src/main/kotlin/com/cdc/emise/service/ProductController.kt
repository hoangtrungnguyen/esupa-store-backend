package com.cdc.emise.service

import com.cdc.emise.entity.Product
import com.cdc.emise.infra.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(@Autowired private val productRepository: ProductRepository) {

    //get all users
    //get user by id
    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") productId: Long): ResponseEntity<Product> {
        val product = productRepository.findById(productId).orElse(null)
        return if (product != null) {
            ResponseEntity(product, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }



}