package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Supplier
import org.springframework.data.jpa.repository.JpaRepository

interface SupplierRepository : JpaRepository<Supplier, Long> {
}