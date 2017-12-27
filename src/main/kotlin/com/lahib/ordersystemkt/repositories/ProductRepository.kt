package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}