package com.example.dockertemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerTemplateApplication

fun main(args: Array<String>) {
	runApplication<DockerTemplateApplication>(*args)
}
