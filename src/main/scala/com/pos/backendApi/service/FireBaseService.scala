package com.pos.backendApi.service

import com.google.api.core.ApiFuture
import com.google.cloud.firestore.{DocumentReference, DocumentSnapshot, Firestore, QueryDocumentSnapshot, QuerySnapshot, WriteResult}
import com.google.firebase.cloud.FirestoreClient
import com.pos.backendApi.model.ProductModel
import com.pos.backendApi.response.ProductResponse
import org.springframework.stereotype.Service

import java.util
import collection.JavaConverters._

@Service
class FireBaseService {


  def addProduct(product: ProductModel) : util.List[String] = {
    val dbFireStore:Firestore = FirestoreClient.getFirestore();
    val apiFuture:ApiFuture[WriteResult] = dbFireStore.collection("product")
      .document(product.getProductName()).set(product);
    val response : util.List[String] = new util.ArrayList[String]
    response.add("Product added successful")
    response.add(apiFuture.get().getUpdateTime().toString)
    response
  }

  def getProduct(productName:String) ={
    val dbFireStore:Firestore = FirestoreClient.getFirestore();
    val docRef:DocumentReference = dbFireStore.collection("product").document(productName)
    val query:ApiFuture[DocumentSnapshot] = docRef.get()
    val document:DocumentSnapshot = query.get()
    if(document.exists()) {
      document.toObject(classOf[ProductResponse])
    }else{
      s"No document found with name $productName"
    }
  }
  def getAllProduct(): util.List[ProductResponse] = {
    val dbFireStore:Firestore = FirestoreClient.getFirestore();
    val query : ApiFuture[QuerySnapshot] = dbFireStore.collection("product").get();
    val querySnapshot :QuerySnapshot = query.get();
    val documents : List[QueryDocumentSnapshot] = querySnapshot.getDocuments().asScala.toList
    val response: util.List[ProductResponse] = new util.ArrayList[ProductResponse]
    for (a <- documents){
        response.add(a.toObject(classOf[ProductResponse]))
    }
    response
  }

  def deleteProduct(name:String) : util.List[String] ={
    val dbFireStore: Firestore = FirestoreClient.getFirestore()
    val apiFuture: ApiFuture[WriteResult] = dbFireStore.collection("product")
      .document(name)
      .delete()
    val response : util.List[String] = new util.ArrayList[String]
    response.add(s"Product $name deleted successful")
    response.add(apiFuture.get().getUpdateTime().toString)
    response
  }
}
