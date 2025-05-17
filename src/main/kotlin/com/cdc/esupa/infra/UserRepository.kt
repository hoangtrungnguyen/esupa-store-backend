package com.cdc.esupa.infra

import org.springframework.data.jpa.repository.JpaRepository

import com.esupa.storemodels.models.User

interface UserRepository : JpaRepository<User, Long> {
}