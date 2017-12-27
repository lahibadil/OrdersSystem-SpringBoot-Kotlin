package com.lahib.ordersystemkt.entities

import com.lahib.ordersystemkt.entities.enums.InvoiceStatus
import java.util.*
import javax.persistence.*

@Entity
data class Invoice(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,

                   @ManyToOne
                   @JoinColumn(name = "order_id", nullable = false)
                   var order: Order? = null,

                   @Temporal(TemporalType.TIMESTAMP)
                   var invoiceDate: Date? = null,

                   @Enumerated(EnumType.STRING)
                   var orderStatus: InvoiceStatus? = null,

                   @OneToMany(cascade = arrayOf(CascadeType.ALL), mappedBy = "invoice")
                   var invoiceLines: List<InvoiceLine>? = null) {
}