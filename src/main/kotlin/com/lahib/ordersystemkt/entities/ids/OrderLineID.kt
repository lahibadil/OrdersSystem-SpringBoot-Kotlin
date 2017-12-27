package com.lahib.ordersystemkt.entities.ids

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
data class OrderLineID(var order_id: Long = 0, var product_id: Long = 0) : Serializable {}