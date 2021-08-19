package com.pos.backendapi.controllers

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
class BaseController {
 @GetMapping(path = Array("/"))
  def baseController()={
    "Hello and welcome to seth pos application"
  }

}
