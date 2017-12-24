package com.lahib.ordersystemkt.db.entities

import javax.persistence.*

@Entity
@Table(name="orders")
data class Order(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id : Long = 0)  {
}