package com.pos.backendApi.service
import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.{FirebaseApp, FirebaseOptions}
import org.springframework.stereotype.Service

import java.io.FileInputStream
import javax.annotation.PostConstruct
@Service
class FirebaseInitializer {

  @PostConstruct
  def initializer:Unit ={
    val serviceAccount = new FileInputStream("./simpleposproject.json")
    val options = new FirebaseOptions.Builder()
      .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      .build();
    FirebaseApp.initializeApp(options)
  }

}
