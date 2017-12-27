package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.entities.Order
import com.lahib.ordersystemkt.repositories.OrderRepository
import com.lahib.ordersystemkt.services.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(@Autowired val repository : OrderRepository) : OrderService {

    override fun findById(id: Long)= repository.getOne(id)

    override fun findAll() = repository.findAll()

    override fun save(entity: Order) = repository.save(entity)

    override fun delete(id: Long) = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Order>) = repository.deleteAll(entities)
}