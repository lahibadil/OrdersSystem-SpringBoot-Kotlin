package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.db.entities.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long> {
}