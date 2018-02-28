package org.throwable.kotlin.mybatis.entity

import java.time.LocalDateTime

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 17:04
 */
data class People(
        var id: Long? = null,
        var firstName: String? = null,
        var lastName: String? = null,
        var gender: String? = null,
        var age: Int? = null,
        var gmtCreated: LocalDateTime? = null,
        var gmtModified: LocalDateTime? = null
)