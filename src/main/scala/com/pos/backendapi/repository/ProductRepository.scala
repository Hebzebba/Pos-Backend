package com.pos.backendapi.repository

import com.pos.backendapi.model.ProductModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait ProductRepository extends JpaRepository[ProductModel, Long]{

}
