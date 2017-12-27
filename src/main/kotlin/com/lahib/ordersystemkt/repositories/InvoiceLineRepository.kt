package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.InvoiceLine
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceLineRepository : JpaRepository<InvoiceLine, Long> {
}