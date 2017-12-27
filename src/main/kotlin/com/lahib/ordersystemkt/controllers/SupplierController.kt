package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.entities.Supplier
import com.lahib.ordersystemkt.services.SupplierService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class SupplierController(val service: SupplierService) {

    @GetMapping(value = ["suppliers"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["suppliers/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["suppliers"])
    fun save(@RequestBody entity : Supplier) = service.save(entity)

    @PutMapping(value = ["suppliers/{id}"])
    fun  update(@RequestBody entity : Supplier) = save(entity)

    @DeleteMapping(value = ["suppliers/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}