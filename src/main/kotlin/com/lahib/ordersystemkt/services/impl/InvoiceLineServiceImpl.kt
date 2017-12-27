package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.entities.InvoiceLine
import com.lahib.ordersystemkt.repositories.InvoiceLineRepository
import com.lahib.ordersystemkt.services.InvoiceLineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InvoiceLineServiceImpl(@Autowired val repository: InvoiceLineRepository) : InvoiceLineService {
    override fun findById(id: Long): InvoiceLine = repository.getOne(id)

    override fun findAll(): List<InvoiceLine> = repository.findAll()

    override fun save(entity: InvoiceLine): InvoiceLine = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<InvoiceLine>) = repository.deleteAll(entities)
}