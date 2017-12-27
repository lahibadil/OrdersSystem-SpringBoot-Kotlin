package com.lahib.ordersystemkt.entities.ids

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
data class InvoiceLineID(var invoice_id: Long = 0, var product_id: Long = 0) : Serializable {

}