package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface AccountRepository : JpaRepository<Account, Long>, BaseRepository<Account>{
}