package com.cdc.esupa.infra

import org.springframework.data.jpa.repository.JpaRepository
interface UserRepository : JpaRepository<User, Long> {
}