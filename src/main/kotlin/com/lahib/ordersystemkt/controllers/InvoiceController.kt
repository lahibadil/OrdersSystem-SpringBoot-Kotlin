package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.entities.Invoice
import com.lahib.ordersystemkt.services.BaseService
import com.lahib.ordersystemkt.services.InvoiceService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class InvoiceController(val service: InvoiceService) {

    @GetMapping(value = ["invoices"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["invoices/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["invoices"])
    fun save(@RequestBody entity : Invoice) = service.save(entity)

    @PutMapping(value = ["invoices/{id}"])
    fun  update(@RequestBody entity : Invoice) = save(entity)

    @DeleteMapping(value = ["invoices/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}