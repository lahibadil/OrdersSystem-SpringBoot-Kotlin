package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long> {
}