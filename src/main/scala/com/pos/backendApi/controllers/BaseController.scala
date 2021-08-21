package com.pos.backendApi.controllers

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class BaseController {
 @GetMapping(path = Array("/"))
  def baseController()={
    "Hello and welcome to seth pos application"
  }

}
