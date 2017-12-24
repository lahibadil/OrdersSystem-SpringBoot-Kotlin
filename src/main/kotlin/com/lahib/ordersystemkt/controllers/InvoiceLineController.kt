package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.db.entities.InvoiceLine
import com.lahib.ordersystemkt.services.InvoiceLineService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class InvoiceLineController(val service: InvoiceLineService) {

    @GetMapping(value = ["invoiceLines"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["invoiceLines/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["invoiceLines"])
    fun save(@RequestBody entity : InvoiceLine) = service.save(entity)

    @PutMapping(value = ["invoiceLines/{id}"])
    fun  update(@RequestBody entity : InvoiceLine) = save(entity)

    @DeleteMapping(value = ["invoiceLines/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}