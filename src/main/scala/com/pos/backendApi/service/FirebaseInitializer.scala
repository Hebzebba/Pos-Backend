package com.pos.backendApi.service
import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.{FirebaseApp, FirebaseOptions}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.{Resource, ResourceLoader}
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct

@Service
 class FirebaseInitializer {

  @Autowired
  var resourceLoader: ResourceLoader = _

  @PostConstruct
  def initializer:Unit ={
    val resource : Resource = resourceLoader.getResource("classpath:simpleposproject.json")
    val serviceAccount = resource.getInputStream()
    val options = new FirebaseOptions.Builder()
      .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      .build();
    FirebaseApp.initializeApp(options)

  }

}
