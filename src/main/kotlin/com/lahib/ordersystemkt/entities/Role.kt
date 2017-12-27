package com.lahib.ordersystemkt.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class Role(@Id
                var id: Long? = null,
                @NotNull
                var code: String? = null,
                @NotNull
                var label: String? = null) {
}