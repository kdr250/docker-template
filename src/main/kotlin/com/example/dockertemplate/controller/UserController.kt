package com.example.dockertemplate.controller

import com.example.dockertemplate.entity.UserEntity
import com.example.dockertemplate.repository.UserEntityRepository
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/users")
class UserController(
  private val userEntityRepository: UserEntityRepository
) {
  @GetMapping
  fun users(): List<UserEntity> {
    return userEntityRepository.findAll()
  }

  @PostMapping(consumes = [MediaType.APPLICATION_FORM_URLENCODED_VALUE])
  fun createUser(@RequestParam(value = "name") name: String): UserEntity {
    val userEntity = UserEntity(name = name)
    userEntityRepository.save(userEntity)
    return userEntity
  }

  @GetMapping(value = ["{id}"])
  fun user(@PathVariable id: Long): UserEntity? {
    return userEntityRepository.findById(id).orElse(null)
  }
}