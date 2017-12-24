package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.db.entities.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long> {
}