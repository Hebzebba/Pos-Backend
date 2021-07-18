package com.pos.backendapi.model

import javax.persistence.{Column, Entity, GeneratedValue, GenerationType, Id}

@Entity
class TransactionsLog {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  private var id: Long = _

  @Column(name = "ProductName")
  private var productName : String = _

  @Column(name = "ProductQuantity")
  private  var productQuantity : Double = _

  @Column(name = "ProductPrice")
  private  var productPrice : Double = _

  @Column(name = "TimeStamp")
  private  var timeStamp : String = _

  def getProductName (): String = {
    productName
  }

  def getProductQuantity (): Double ={
    productQuantity
  }

  def getProductPrice (): Double={
    productPrice
  }
  def getTimeStamp (): String = {
    timeStamp
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
  def setTimeStamp (time:String): Unit= {
    timeStamp = time
  }
}
