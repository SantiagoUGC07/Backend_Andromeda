package com.operacion.andromeda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.models.ProductosModel;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosModel, Integer> {

}
