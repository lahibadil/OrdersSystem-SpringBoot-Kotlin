package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.entities.Invoice
import com.lahib.ordersystemkt.repositories.InvoiceRepository
import com.lahib.ordersystemkt.services.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InvoiceServiceImpl(@Autowired val repository: InvoiceRepository) : InvoiceService {
    override fun findById(id: Long): Invoice = repository.getOne(id)

    override fun findAll(): List<Invoice> = repository.findAll()

    override fun save(entity: Invoice): Invoice = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Invoice>) = repository.deleteAll(entities)
}