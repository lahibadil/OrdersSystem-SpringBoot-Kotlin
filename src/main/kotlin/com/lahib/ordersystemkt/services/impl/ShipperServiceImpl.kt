package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.entities.Shipper
import com.lahib.ordersystemkt.repositories.ShipperRepository
import com.lahib.ordersystemkt.services.ShipperService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ShipperServiceImpl(@Autowired val repository: ShipperRepository) : ShipperService {
    override fun findById(id: Long): Shipper = repository.getOne(id)

    override fun findAll(): List<Shipper> = repository.findAll()

    override fun save(entity: Shipper): Shipper = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Shipper>) = repository.deleteAll(entities)
}