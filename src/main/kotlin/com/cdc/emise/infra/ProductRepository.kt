package com.cdc.emise.infra

import com.cdc.emise.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
    fun findProductById(id: Long): Product
}