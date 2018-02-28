package org.throwable.springboot.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.throwable.springboot.entity.People
import org.throwable.springboot.repository.PeopleRepository

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 11:55
 */
@Service
class PeopleService {

    @Autowired
    private lateinit var peopleRepository: PeopleRepository

    fun findByLastName(lastName: String): List<People> {
        return peopleRepository.findByLastName(lastName)
    }

    fun <S : People?> save(entity: S): S {
        return peopleRepository.save(entity)
    }

    fun <S : People?> saveAll(entities: MutableIterable<S>): MutableIterable<S> {
        return peopleRepository.saveAll(entities)
    }

    fun findAll(): MutableIterable<People> {
        return peopleRepository.findAll()
    }

    fun findAll(ids: MutableIterable<Long>): MutableIterable<People> {
        return peopleRepository.findAllById(ids)
    }
}