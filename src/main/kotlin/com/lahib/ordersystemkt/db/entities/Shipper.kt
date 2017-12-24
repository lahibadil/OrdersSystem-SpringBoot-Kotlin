package com.lahib.ordersystemkt.db.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class Shipper (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id : Long = 0)  {
}