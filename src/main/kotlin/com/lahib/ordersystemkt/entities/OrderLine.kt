package com.lahib.ordersystemkt.entities

import com.lahib.ordersystemkt.entities.ids.OrderLineID
import java.math.BigDecimal
import javax.persistence.*


@Entity
data class OrderLine(@EmbeddedId
                     var lineID: OrderLineID? = null,
                     @ManyToOne
                     @JoinColumn(name = "order_id")
                     @MapsId("order_id")
                     private var order: Order? = null,

                     @ManyToOne
                     @JoinColumn(name = "product_id")
                     @MapsId("product_id")
                     private var product: Product? = null,

                     private var lineNumber: Int = 0,
                     private var quantity: Int = 0,
                     private var unitPrice: BigDecimal? = null
                    ) {}