package com.lahib.ordersystemkt.controllers

import com.lahib.ordersystemkt.services.BaseService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*


open class BaseController<T>(val service: BaseService<T>) {

    val controller = ""

    @GetMapping(value = ["${controller}"])
    fun getAll() = service.findAll()

    @GetMapping(value = ["${controller}/{id}"])
    fun get(@PathVariable("id") id : Long) = service.findById(id)

    @PostMapping(value = ["${controller}"])
    fun save(@RequestBody entity : T) = service.save(entity)

    @PutMapping(value = ["${controller}"])
    fun  update(@RequestBody entity : T) = save(entity)

    @DeleteMapping(value = ["${controller}/{id}"])
    fun delete(@PathVariable("id") id : Long) = service.delete(id)
}