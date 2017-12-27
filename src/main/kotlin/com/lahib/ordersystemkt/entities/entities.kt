package com.lahib.ordersystemkt.entities

import lombok.Data
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity

@Data
@Embeddable
class Address {

    @Column(name = "line1")
    private var line1: String? = null

    @Column(name = "line2")
    private var line2: String? = null

    @Column(name = "city")
    private var city: String? = null

    @Column(name = "zip")
    private var zip: String? = null

    @Column(name = "country")
    private var country: String? = null


}