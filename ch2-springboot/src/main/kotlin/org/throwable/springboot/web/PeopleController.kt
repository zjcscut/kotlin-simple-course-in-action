package org.throwable.springboot.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.throwable.springboot.entity.People
import org.throwable.springboot.service.PeopleService

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 12:04
 */
@RestController
class PeopleController {

    @Autowired
    private lateinit var peopleService: PeopleService

    @GetMapping(value = ["/get"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun get(@RequestParam(value = "lastName") lastName: String): Any {
        val people = peopleService.findByLastName(lastName)
        val map = HashMap<Any, Any>()
        map.put("hello", people)
        return map
    }
}