package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.db.entities.Payment
import com.lahib.ordersystemkt.repositories.PaymentRepository
import com.lahib.ordersystemkt.services.PaymentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PaymentServiceImpl(@Autowired val repository : PaymentRepository) : PaymentService {
    override fun findById(id: Long): Payment = repository.getOne(id)

    override fun findAll(): List<Payment> = repository.findAll()

    override fun save(entity: Payment): Payment = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Payment>)= repository.deleteAll(entities)
}