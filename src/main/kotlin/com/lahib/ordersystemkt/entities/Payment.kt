package com.lahib.ordersystemkt.entities

import java.math.BigDecimal
import java.util.*
import javax.persistence.*


@Entity
data class Payment(@Id
                   @GeneratedValue(strategy = GenerationType.IDENTITY)
                   var id: Long = 0,

                   @OneToOne(cascade = arrayOf(CascadeType.ALL), optional = true)
                   @JoinColumn(name = "order_id")
                   var order: Order? = null,

                   @Temporal(TemporalType.TIMESTAMP)
                   var payementDate: Date? = null,
                   var amount: BigDecimal? = null,
                   var checkNumber: String? = null) {
}