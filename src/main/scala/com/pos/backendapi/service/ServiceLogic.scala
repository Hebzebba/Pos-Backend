package com.pos.backendapi.service
import com.pos.backendapi.model.ProductModel
import com.pos.backendapi.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List


@Service
class ServiceLogic{

  @Autowired
  var productRepository : ProductRepository = _

  def addProduct (name:String, quantity:Double, price: Double) : String ={
    var productModel = new ProductModel()
    try {
      productModel.setProductName(name)
      productModel.setProductPrice(price)
      productModel.setProductQuantity(quantity)
      productRepository.save(productModel)

    }catch {
      case e: NullPointerException => print(e)
    }
    "Item added successful"
  }

    def getAllProduct () : List[ProductModel] ={
        productRepository.findAll()
    }

    def deleteProduct(id:Long):String = {
      productRepository.deleteById(id)
      "Product deleted"
    }
    def deleteAllProduct ():String={
      productRepository.deleteAll()
      "Items deleted"
    }
}
