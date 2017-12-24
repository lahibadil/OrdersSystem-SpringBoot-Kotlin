package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.db.entities.Customer
import com.lahib.ordersystemkt.services.CustomerService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class CustomerController(val service: CustomerService) {

    @GetMapping(value = ["customers"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["customers/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["customers"])
    fun save(@RequestBody entity : Customer) = service.save(entity)

    @PutMapping(value = ["customers/{id}"])
    fun  update(@RequestBody entity : Customer) = save(entity)

    @DeleteMapping(value = ["customers/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}