package com.lahib.ordersystemkt.db.entities

import lombok.Data
import javax.persistence.Column
import javax.persistence.Embeddable

@Data
@Embeddable
data class Adress(@Column(name = "line1") val line1: String? = null, @Column(name = "line2") val line2: String? = null, @Column(name = "city") val city: String? = null, @Column(name = "zip") val zip: String? = null, @Column(name = "country") val country: String? = null) {

}