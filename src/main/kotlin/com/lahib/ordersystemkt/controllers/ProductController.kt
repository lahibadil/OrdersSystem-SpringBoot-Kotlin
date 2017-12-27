package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.entities.Product
import com.lahib.ordersystemkt.services.ProductService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class ProductController(val service: ProductService) {

    @GetMapping(value = ["products"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["products/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["products"])
    fun save(@RequestBody entity : Product) = service.save(entity)

    @PutMapping(value = ["products/{id}"])
    fun  update(@RequestBody entity : Product) = save(entity)

    @DeleteMapping(value = ["products/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}