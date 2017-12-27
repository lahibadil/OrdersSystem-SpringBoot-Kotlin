package com.lahib.ordersystemkt.entities

import javax.persistence.*


@Entity
data class Shipper(@Id
                   @GeneratedValue(strategy = GenerationType.IDENTITY)

                   var id: Long = 0,

                   var company: String? = null,

                   @ElementCollection
                   @CollectionTable(name = "shipper_contact", joinColumns = arrayOf(JoinColumn(name = "shipper_id")))
                   @MapKeyColumn(name = "contactJobTitle")
                   var contacts: Map<String, String>? = null) {
}