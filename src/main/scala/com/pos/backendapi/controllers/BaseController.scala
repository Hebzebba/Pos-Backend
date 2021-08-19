package com.pos.backendapi.controllers

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class BaseController {
  @RequestMapping(path = Array("/"))
  def baseController()={
    "Hello and welcome to seth pos application"
  }

}
