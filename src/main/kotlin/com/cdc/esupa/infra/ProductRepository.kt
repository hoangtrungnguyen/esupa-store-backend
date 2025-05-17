package com.cdc.esupa.infra

import com.esupa.storemodels.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
    fun findProductById(id: Long): Product
}