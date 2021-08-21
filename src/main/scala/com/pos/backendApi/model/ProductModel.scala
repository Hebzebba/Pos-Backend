package com.pos.backendApi.model

class ProductModel {

  private var productName : String = _
  private  var productQuantity : Double = _
  private  var productPrice : Double = _

  def getProductName (): String = {
    productName
  }

  def getProductQuantity (): Double ={
    productQuantity
  }

  def getProductPrice (): Double={
    productPrice
  }

  def setProductName (name:String): Unit= {
   productName = name
  }

  def setProductQuantity (quantity: Double): Unit ={
    productQuantity = quantity
  }

  def setProductPrice (price: Double):Unit={
    productPrice = price
  }
}
