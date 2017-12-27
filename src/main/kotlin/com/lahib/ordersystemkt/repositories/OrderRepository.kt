package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface OrderRepository : JpaRepository<Order, Long> {

}