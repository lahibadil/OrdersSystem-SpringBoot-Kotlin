package com.lahib.ordersystemkt.entities

import lombok.Data
import javax.persistence.Column
import javax.persistence.Embeddable

@Data
@Embeddable
data class Adress(@Column(name = "line1") var line1: String? = null,
                  @Column(name = "line2") var line2: String? = null,
                  @Column(name = "city") var city: String? = null,
                  @Column(name = "zip") var zip: String? = null,
                  @Column(name = "country") var country: String? = null) {

}