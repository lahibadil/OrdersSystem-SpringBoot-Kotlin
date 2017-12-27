package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.entities.Employee
import com.lahib.ordersystemkt.services.EmployeeService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
@Slf4j
 class EmployeeController(val service: EmployeeService) {

    @GetMapping(value = ["employees"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["employees/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["employees"])
    fun save(@RequestBody entity : Employee) = service.save(entity)

    @PutMapping(value = ["employees/{id}"])
    fun  update(@RequestBody entity : Employee) = save(entity)

    @DeleteMapping(value = ["employees/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}