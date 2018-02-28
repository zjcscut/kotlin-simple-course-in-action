package org.throwable.kotlin.mybatis.mapper

import org.apache.ibatis.annotations.Mapper
import org.throwable.kotlin.mybatis.entity.People

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 17:05
 */
@Mapper
interface PeopleMapper {

    fun findByLastName(lastName: String): List<People>
}