package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.db.entities.OrderLine
import org.springframework.data.jpa.repository.JpaRepository

interface OrderLineRepository : JpaRepository<OrderLine, Long> {
}