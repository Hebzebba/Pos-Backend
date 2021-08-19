package com.pos.backendapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Main {
}
object Main {
  def main(args : Array[String]): Unit ={
    SpringApplication.run(classOf[Main])
  }
}