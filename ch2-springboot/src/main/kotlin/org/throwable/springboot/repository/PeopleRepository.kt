package org.throwable.springboot.repository

import org.springframework.data.repository.CrudRepository
import org.throwable.springboot.entity.People

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 11:54
 */
interface PeopleRepository : CrudRepository<People, Long> {

    fun findByLastName(lastName: String): List<People>
}