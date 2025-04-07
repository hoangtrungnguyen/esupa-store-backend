package com.cdc.emise.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "customers")
data class Customer (
    @Id
    @Column(name = "id", nullable = false)
    open val id: Long = -1
)