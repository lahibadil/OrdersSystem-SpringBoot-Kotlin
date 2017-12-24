package com.lahib.ordersystemkt.services


interface BaseService<T> {

    /***
     * returns the element with the given ID
     * @param id the ID of the element to bet retrieved
     * @return the element with the given id or null if none found
     */
    fun findById(id: Long): T

    /**
     * returns all the elements from DB
     */
    fun findAll(): List<T>

    /**
     * saves or updates the given entity
     * @return the saved or updated element
     */
    fun save(entity: T): T

    /**
     * deletes the element with the given id
     * @return true if the element was successfully deleted, or false if not
     */
    fun delete(id: Long): Boolean

     /**
     * deletes the given collections
     * @return true if the elements were successfully deleted, or false if not
     */
    fun delete(entities: Iterable<T>)

}