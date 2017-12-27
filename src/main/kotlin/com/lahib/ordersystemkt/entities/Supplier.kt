package com.lahib.ordersystemkt.entities

import javax.persistence.*


@Entity
data class Supplier(@Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)

                    var id: Long = 0,
                    var company: String? = null,
                    var contact: String? = null,
                    var contactJobTitle: String? = null,
                    var phoneOffice: String? = null,
                    var phoneMobile: String? = null,
                    var fax: String? = null,
                    var email: String? = null,
                    @Embedded
                    var address: Address? = null,
                    @ManyToMany(cascade = arrayOf(CascadeType.ALL), mappedBy = "suppliers")
                    var products: List<Product>? = null) {
}