package org.throwable.kotlin.mybatis.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.throwable.kotlin.mybatis.mapper.PeopleMapper

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 17:11
 */
@RestController
class PeopleController {

    @Autowired
    private lateinit var peopleMapper: PeopleMapper

    @GetMapping(value = ["/get"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun get(@RequestParam(value = "lastName") lastName: String): Any {
        val people = peopleMapper.findByLastName(lastName)
        val map = HashMap<Any, Any>()
        map["people"] = people
        return map
    }
}