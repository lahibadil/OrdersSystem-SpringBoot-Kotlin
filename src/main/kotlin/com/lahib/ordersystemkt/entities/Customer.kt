package com.lahib.ordersystemkt.entities

import javax.persistence.*
import javax.validation.constraints.Max

@Entity
data class Customer(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
                    var company: String? = null,
                    @Max(10) var phoneOffice: String? = null,
                    @Max(10) var phoneMobile: String? = null,
                    @Max(10) var fax: String? = null,
                    @Embedded var address: Address,
                    @ElementCollection
                    @CollectionTable(name = "costumer_contacts", joinColumns = [JoinColumn(name = "customer_id")])
                    @MapKeyColumn(name = "contactJobTitle")
                    var contacts: Map<String, String> = hashMapOf()
) {}