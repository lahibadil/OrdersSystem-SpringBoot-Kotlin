package com.lahib.ordersystemkt.entities

import com.lahib.ordersystemkt.entities.ids.InvoiceLineID
import java.math.BigDecimal
import javax.persistence.*


@Entity
data class InvoiceLine(@EmbeddedId var invoiceLineID: InvoiceLineID? = null,
                       @ManyToOne
                       @MapsId("invoice_id")
                       @JoinColumn(name = "invoice_id")
                       var invoice: Invoice? = null,

                       @ManyToOne
                       @MapsId("product_id")
                       @JoinColumn(name = "product_id")
                       var product: Product? = null,

                       var unitPrice: BigDecimal? = null,
                       var unitsShipped: Int = 0,
                       var lineNumber: Int = 0) {
}