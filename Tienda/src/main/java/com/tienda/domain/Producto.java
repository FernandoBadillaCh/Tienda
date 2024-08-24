package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Long idProducto;
	private String detalle;
	private int existencias;
	private double precio;
	private String descripcion;
	private String rutaImagen;
	private boolean activo;

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	Categoria categoria;




	public Producto(String producto, boolean activo) {
		this.descripcion = producto;
		this.activo = activo;
	}

	public Producto() {

	}

	public Long getIdCategoria() {
		return categoria.getIdCategoria();
	}
}
