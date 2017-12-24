package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.db.entities.OrderLine
import com.lahib.ordersystemkt.services.OrderLineService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class OrderLineController(val service: OrderLineService) {

    @GetMapping(value = ["orderLines"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["orderLines/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["orderLines"])
    fun save(@RequestBody entity : OrderLine) = service.save(entity)

    @PutMapping(value = ["orderLines/{id}"])
    fun  update(@RequestBody entity : OrderLine) = save(entity)

    @DeleteMapping(value = ["orderLines/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}