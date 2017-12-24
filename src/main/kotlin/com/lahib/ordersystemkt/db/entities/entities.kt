package com.lahib.ordersystemkt.db.entities

import lombok.Data
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity

@Data
@Embeddable
class Address {

    @Column(name = "line1")
    private val line1: String? = null

    @Column(name = "line2")
    private val line2: String? = null

    @Column(name = "city")
    private val city: String? = null

    @Column(name = "zip")
    private val zip: String? = null

    @Column(name = "country")
    private val country: String? = null


}