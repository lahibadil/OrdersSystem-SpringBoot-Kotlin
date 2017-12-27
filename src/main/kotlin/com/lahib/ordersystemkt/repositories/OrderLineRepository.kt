package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.OrderLine
import org.springframework.data.jpa.repository.JpaRepository

interface OrderLineRepository : JpaRepository<OrderLine, Long> {
}