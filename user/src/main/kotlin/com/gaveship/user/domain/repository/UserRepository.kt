package com.gaveship.user.domain.repository

import com.gaveship.user.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findAllById(id: Long): List<User>
}