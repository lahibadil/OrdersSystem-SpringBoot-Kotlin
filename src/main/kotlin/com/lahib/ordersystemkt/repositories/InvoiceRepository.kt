package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.db.entities.Invoice
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceRepository: JpaRepository<Invoice, Long> {
}