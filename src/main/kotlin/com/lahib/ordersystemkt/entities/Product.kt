package com.lahib.ordersystemkt.entities

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Product(@Id
                   @GeneratedValue(strategy = GenerationType.IDENTITY)
                   var id: Long = 0,

                   var code: String? = null,

                   var description: String? = null,

                   var suggestedUnitPrice: BigDecimal? = null,

                   var buyUnitPrice: BigDecimal? = null,

                   var unitsInStock: Int = 0,

                   var unitsOnOrder: Int = 0,

                   var reorderLevel: Int = 0,

                   @ManyToMany(cascade = arrayOf(CascadeType.ALL))
                   @JoinTable(name = "productSupplier",
                           joinColumns = arrayOf(JoinColumn(name = "product_id")),
                           inverseJoinColumns = arrayOf(JoinColumn(name = "supplier_id")))
                   var suppliers : List<Supplier> = listOf()
                   ) {}