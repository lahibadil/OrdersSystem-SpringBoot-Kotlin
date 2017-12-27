package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Invoice
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceRepository: JpaRepository<Invoice, Long> {
}