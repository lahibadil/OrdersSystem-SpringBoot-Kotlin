package com.lahib.ordersystemkt.services.impl

import com.lahib.ordersystemkt.db.entities.Product
import com.lahib.ordersystemkt.repositories.ProductRepository
import com.lahib.ordersystemkt.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(@Autowired val repository : ProductRepository) : ProductService {
    override fun findById(id: Long): Product = repository.getOne(id)

    override fun findAll(): List<Product> = repository.findAll()

    override fun save(entity: Product): Product = repository.save(entity)

    override fun delete(id: Long): Boolean = try{ repository.deleteById(id); true }catch (e : Exception){ false}

    override fun delete(entities: Iterable<Product>) = repository.deleteAll(entities)
}