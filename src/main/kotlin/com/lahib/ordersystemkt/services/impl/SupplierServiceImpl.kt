package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.db.entities.Supplier
import com.lahib.ordersystemkt.repositories.SupplierRepository
import com.lahib.ordersystemkt.services.SupplierService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class SupplierServiceImpl(@Autowired val repository: SupplierRepository) : SupplierService {

    override fun findById(id: Long): Supplier = repository.getOne(id)

    override fun findAll(): List<Supplier> = repository.findAll()

    override fun save(entity: Supplier): Supplier = repository.save(entity)

    override fun delete(id: Long)= try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Supplier>) = repository.deleteAll(entities)
}