package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.db.entities.Employee
import com.lahib.ordersystemkt.repositories.EmployeeRepository
import com.lahib.ordersystemkt.services.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(@Autowired val repository: EmployeeRepository) : EmployeeService {

    override fun findById(id: Long): Employee= repository.getOne(id)

    override fun findAll(): List<Employee> = repository.findAll()

    override fun save(entity: Employee): Employee = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Employee>) = repository.deleteAll(entities)
}