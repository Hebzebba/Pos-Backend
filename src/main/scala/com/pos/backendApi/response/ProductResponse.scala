package com.pos.backendApi.response

class ProductResponse {
  var productName : String = null
  var productQuantity = .0
  var productPrice = .0

  def getProductName = productName

  def setProductName(productName: String) = this.productName = productName

  def getProductQuantity = productQuantity

  def setProductQuantity(productQuantity: Double) = this.productQuantity = productQuantity

  def getProductPrice = productPrice

  def setProductPrice(productPrice: Double) = this.productPrice = productPrice
}