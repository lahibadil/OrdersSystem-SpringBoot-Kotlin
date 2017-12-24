package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.db.entities.Shipper
import com.lahib.ordersystemkt.services.ShipperService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class ShipperController(val service: ShipperService) {

    @GetMapping(value = ["shippers"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["shippers/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["shippers"])
    fun save(@RequestBody entity : Shipper) = service.save(entity)

    @PutMapping(value = ["shippers/{id}"])
    fun  update(@RequestBody entity : Shipper) = save(entity)

    @DeleteMapping(value = ["shippers/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}