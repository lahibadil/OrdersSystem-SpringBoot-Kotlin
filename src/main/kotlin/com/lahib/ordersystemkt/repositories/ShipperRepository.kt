package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.db.entities.Shipper
import org.springframework.data.jpa.repository.JpaRepository

interface ShipperRepository : JpaRepository<Shipper, Long> {
}