package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long> {
}