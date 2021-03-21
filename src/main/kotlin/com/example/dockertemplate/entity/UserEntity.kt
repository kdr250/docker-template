package com.example.dockertemplate.entity

import javax.persistence.*

@Entity
@Table(name = "tb_user")
data class UserEntity(
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  val id: Long? = null,

  @Column(name = "name")
  val name: String? = null
)