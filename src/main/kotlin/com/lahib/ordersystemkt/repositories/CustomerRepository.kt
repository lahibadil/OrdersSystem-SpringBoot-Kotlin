package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long> {
}