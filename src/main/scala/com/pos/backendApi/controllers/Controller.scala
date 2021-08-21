package com.pos.backendApi.controllers

import com.pos.backendApi.model.ProductModel
import com.pos.backendApi.service.{FireBaseService}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{DeleteMapping, GetMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RequestParam, RestController}


@RestController
@RequestMapping(path = Array("/api"))
class Controller {
  @Autowired
  var fireBaseService : FireBaseService = _

  @PostMapping(path = Array("/add"))
  def add(@RequestBody product: ProductModel)= {
    fireBaseService.addProduct(product)
  }

  @GetMapping(path = Array("/get-product/{product_name}"))
  def getProduct (@PathVariable product_name:String)={
    fireBaseService.getProduct(product_name)
  }
  @GetMapping(path = Array("/get-all-product"))
  def getAllProduct() = {
    fireBaseService.getAllProduct()
  }

  @DeleteMapping(path=Array("/delete"))
  def deleteProduct(@RequestParam name: String)={
    fireBaseService.deleteProduct(name)
  }

}
