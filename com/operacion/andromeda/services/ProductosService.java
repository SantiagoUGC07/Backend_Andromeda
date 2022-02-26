package com.operacion.andromeda.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.models.ProductosModel;
import com.operacion.andromeda.repositories.ProductosRepository;

@Service
public class ProductosService {
	private final ProductosRepository productosRepository;
	
	public ProductosService(@Autowired ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}

	
	//obtener y mostrar elementos
	
	public ArrayList<ProductosModel> obtenerDatos(){
		return (ArrayList<ProductosModel>) productosRepository.findAll();
	}
	
	
	//guardar datos
	public ProductosModel guardarDatos(ProductosModel productosModel) {
		return productosRepository.save(productosModel);
	}
	
	
	//Eliminar datos
	public boolean eliminarDato(Integer id) {
		try {
			productosRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}
	

	
	
}
