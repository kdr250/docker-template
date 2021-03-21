package com.example.dockertemplate.repository

import com.example.dockertemplate.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserEntityRepository : JpaRepository<UserEntity, Long> {
}