package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.db.entities.Customer
import com.lahib.ordersystemkt.repositories.CustomerRepository
import com.lahib.ordersystemkt.services.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(@Autowired val repository: CustomerRepository) : CustomerService {

    override fun findById(id: Long): Customer = repository.getOne(id)

    override fun findAll(): List<Customer> = repository.findAll()

    override fun save(entity: Customer): Customer = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Customer>) = repository.deleteAll(entities)
}