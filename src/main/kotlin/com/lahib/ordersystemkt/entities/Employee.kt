package com.lahib.ordersystemkt.entities

import javax.persistence.*

@Entity
data class Employee(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
                    var firstName: String? = null,
                    var lastName: String? = null,
                    var jobTitle: String? = null,
                    var phone: String? = null,
                    var email: String? = null,
                    @Embedded
                    var address: Address? = null,
                    @ManyToOne(cascade = arrayOf(CascadeType.PERSIST ), fetch = FetchType.LAZY)
                    @JoinColumn(name = "reportsTo")
                    var reportsTo: Employee? = null
) {}