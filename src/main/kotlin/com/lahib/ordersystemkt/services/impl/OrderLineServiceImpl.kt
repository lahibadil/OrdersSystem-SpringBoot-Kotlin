package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.db.entities.OrderLine
import com.lahib.ordersystemkt.repositories.OrderLineRepository
import com.lahib.ordersystemkt.services.OrderLineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class OrderLineServiceImpl(@Autowired val  repository: OrderLineRepository) : OrderLineService {
    override fun findById(id: Long): OrderLine = repository.getOne(id)

    override fun findAll(): List<OrderLine> = repository.findAll()

    override fun save(entity: OrderLine): OrderLine = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<OrderLine>) = repository.deleteAll(entities)
}