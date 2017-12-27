package com.lahib.ordersystemkt.entities

import com.lahib.ordersystemkt.entities.enums.OrderStatus
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "orders")
data class Order(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
                 @Temporal(TemporalType.TIMESTAMP)
                 var orderDate: Date? = null,

                 @Temporal(TemporalType.TIMESTAMP)
                 var requiredDate: Date? = null,

                 @Enumerated(EnumType.STRING)
                 var orderStatus: OrderStatus? = null,

                 @Temporal(TemporalType.TIMESTAMP)
                 var shipedDate: Date? = null,

                 var shipToName: String? = null,

                 @Embedded
                 @AttributeOverrides(AttributeOverride(name = "line1", column = Column(name = "shipToLine1")),
                         AttributeOverride(name = "line2", column = Column(name = "shipToLine2")),
                         AttributeOverride(name = "city", column = Column(name = "shipToCity")),
                         AttributeOverride(name = "zip", column = Column(name = "shipToZip")),
                         AttributeOverride(name = "country", column = Column(name = "shipToCountry")))
                 var shipToAddress: Address? = null,

                 @ManyToOne(cascade = arrayOf(CascadeType.ALL))
                 @JoinColumn(name = "customer_id", nullable = false)
                 var customer: Customer? = null,

                 @ManyToOne(cascade = arrayOf(CascadeType.ALL))
                 @JoinColumn(name = "employee_id")
                 var employee: Employee? = null,

                 @ManyToOne(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY)
                 @JoinColumn(name = "shipper_id")
                 var shipper: Shipper? = null,

                 @OneToMany(cascade = arrayOf(CascadeType.ALL), mappedBy = "order")
                 var orderLines: List<OrderLine> = listOf(),

                 @OneToOne(cascade = arrayOf(CascadeType.ALL), mappedBy = "order")
                 var payment: Payment? = null,

                 @OneToMany(cascade = arrayOf(CascadeType.ALL), mappedBy = "order")
                 var invoices: List<Invoice> = listOf()) {


}