package com.lahib.ordersystemkt.repositories

import com.lahib.ordersystemkt.entities.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long> {
}