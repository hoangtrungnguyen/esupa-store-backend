package com.cdc.emise.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "products")
data class Product(
    @Id
    @Column(name = "id", nullable = false)
    open val id: Long = -1,
    @Column(name = "code")
    open  val code: String? = null,
    @Column(name = "quantity")
    open  val quantity : String? = null
)