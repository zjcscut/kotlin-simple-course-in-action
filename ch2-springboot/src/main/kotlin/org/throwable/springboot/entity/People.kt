package org.throwable.springboot.entity

import java.util.*
import javax.persistence.*

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 11:51
 */
@Entity
@Table(name = "people")
data class People(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null,
        var firstName: String? = null,
        var lastName: String? = null,
        var gender: String? = null,
        var age: Int? = null,
        var gmtCreated: Date? = null,
        var gmtModified: Date? = null
)