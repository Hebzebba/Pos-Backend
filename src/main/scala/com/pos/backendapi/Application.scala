package com.pos.backendapi


import org.springframework.boot.SpringApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}


@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
class SpringIntegration{}

object Application {
def main(args : Array[String]): Unit ={
   SpringApplication.run(classOf[SpringIntegration])
}
}
