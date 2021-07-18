package com.pos.backendapi.controllers

import com.pos.backendapi.model.ProductModel
import com.pos.backendapi.service.{FireBaseService, ServiceLogic}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RestController}

import java.util.List


@RestController
@RequestMapping(path = Array("/api"))
class Controller {

   @Autowired
   var serviceLogic: ServiceLogic = _

  @Autowired
  var fireBaseService : FireBaseService = _

//  @PostMapping(path = Array("add/{name}/{quantity}/{price}"))
//  def saveProduct (@PathVariable name: String, @PathVariable quantity: Double, @PathVariable price: Double ): String ={
//     serviceLogic.addProduct(name,quantity,price);
//  }

  @PostMapping(path = Array("/add"))
  def add(@RequestBody product: ProductModel):String = {
    fireBaseService.addProduct(product)
  }

  @GetMapping(path = Array("/product"))
  def getProduct():List[ProductModel] = {
    serviceLogic.getAllProduct()
  }

  @GetMapping(path=Array("/delete/{id}"))
  def deleteProduct(@PathVariable id: Long):String={
    serviceLogic.deleteProduct(id)
  }

  @GetMapping(path=Array("/delete-all"))
  def deleteAllProduct():String={
    serviceLogic.deleteAllProduct()
  }
}
