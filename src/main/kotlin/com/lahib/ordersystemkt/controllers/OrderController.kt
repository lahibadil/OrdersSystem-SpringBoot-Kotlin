package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.entities.Order
import com.lahib.ordersystemkt.services.OrderService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
@RequestMapping("/api/")
class OrderController(@Autowired val service: OrderService){
    
    @GetMapping(value = ["orders"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["orders/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["orders"])
    fun save(@RequestBody entity : Order) = service.save(entity)

    @PutMapping(value = ["orders/{id}"])
    fun  update(@RequestBody entity : Order) = save(entity)

    @DeleteMapping(value = ["orders/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)

}