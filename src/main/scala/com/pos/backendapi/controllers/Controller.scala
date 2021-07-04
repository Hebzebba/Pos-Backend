package com.pos.backendapi.controllers

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class Controller {

  @GetMapping(path = Array("/"))
  def printHello (): String ={
    "Hello world from seth"
  }

}
