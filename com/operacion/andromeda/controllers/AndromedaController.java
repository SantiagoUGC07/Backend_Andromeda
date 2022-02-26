package com.operacion.andromeda.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.models.ProductosModel;
import com.operacion.andromeda.services.ProductosService;

@RestController
public class AndromedaController {
	private final ProductosService productosService;
	
	public AndromedaController(@Autowired ProductosService productosService) {
		this.productosService = productosService;
	}
	
	//mostrar datos de sal�n
	@GetMapping("/andromeda")
	public ArrayList<ProductosModel> obtenerDato(){
		return productosService.obtenerDatos();	
	}
	
	// guardar datos en la tabla sal�n
	@PostMapping("/andromeda")
    public ProductosModel guardarDatos(@RequestBody ProductosModel productosModel) {
    	return productosService.guardarDatos(productosModel);
    }
	
	//eliminarDato
	@DeleteMapping(path = "andromeda/{id}") //localhost:8080/1
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return productosService.eliminarDato(id);
	}
	
	
	
}
