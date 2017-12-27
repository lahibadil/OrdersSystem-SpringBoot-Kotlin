package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.entities.Payment
import com.lahib.ordersystemkt.services.PaymentService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class PaymentController(val service: PaymentService) {

    @GetMapping(value = ["payments"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["payments/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["payments"])
    fun save(@RequestBody entity : Payment) = service.save(entity)

    @PutMapping(value = ["payments/{id}"])
    fun  update(@RequestBody entity : Payment) = save(entity)

    @DeleteMapping(value = ["payments/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}