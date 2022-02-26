package com.operacion.andromeda.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductosModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id_producto;
	
	@Column
	private String nombre_producto ;
	
	@Column
	private int precio_producto ;
	
	@Column
	private int cantidad_producto;
	
	@Column
	private String descripcion_producto;
	
	@Column
	private String ruta_imagen_1 ;
	
	@Column
	private String ruta_imagen_2;
	
	@Column
	private String ruta_imagen_3;
	
	@Column
	private String categoria;
	
	@Column
	private int descuento;
	
	@Column
	private int codigo_de_barras;

	public ProductosModel() {
		
	}


	public Integer getId_producto() {
		return id_producto;
	}


	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(int precio_producto) {
		this.precio_producto = precio_producto;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public String getRuta_imagen_1() {
		return ruta_imagen_1;
	}

	public void setRuta_imagen_1(String ruta_imagen_1) {
		this.ruta_imagen_1 = ruta_imagen_1;
	}

	public String getRuta_imagen_2() {
		return ruta_imagen_2;
	}

	public void setRuta_imagen_2(String ruta_imagen_2) {
		this.ruta_imagen_2 = ruta_imagen_2;
	}

	public String getRuta_imagen_3() {
		return ruta_imagen_3;
	}

	public void setRuta_imagen_3(String ruta_imagen_3) {
		this.ruta_imagen_3 = ruta_imagen_3;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getCodigo_de_barras() {
		return codigo_de_barras;
	}

	public void setCodigo_de_barras(int codigo_de_barras) {
		this.codigo_de_barras = codigo_de_barras;
	}

	@Override
	public String toString() {
		return "ProductosModels [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto
				+ ", precio_producto=" + precio_producto + ", cantidad_producto=" + cantidad_producto
				+ ", descripcion_producto=" + descripcion_producto + ", ruta_imagen_1=" + ruta_imagen_1
				+ ", ruta_imagen_2=" + ruta_imagen_2 + ", ruta_imagen_3=" + ruta_imagen_3 + ", categoria=" + categoria
				+ ", descuento=" + descuento + ", codigo_de_barras=" + codigo_de_barras + "]";
	}

	
	

	
	
}
