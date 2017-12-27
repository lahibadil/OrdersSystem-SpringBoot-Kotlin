package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Shipper
import org.springframework.data.jpa.repository.JpaRepository

interface ShipperRepository : JpaRepository<Shipper, Long> {
}