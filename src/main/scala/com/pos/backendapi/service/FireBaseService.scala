package com.pos.backendapi.service

import com.google.api.core.ApiFuture
import com.google.cloud.firestore.{Firestore, WriteResult}
import com.google.firebase.cloud.FirestoreClient
import com.pos.backendapi.model.ProductModel
import org.springframework.stereotype.Service

@Service
class FireBaseService {

  def addProduct(product: ProductModel) : String = {
    val dbFireStore:Firestore = FirestoreClient.getFirestore();
    val apiFuture:ApiFuture[WriteResult] = dbFireStore.collection("product")
      .document(product.getProductName()).set(product);
    apiFuture.get().getUpdateTime().toString
  }

}
