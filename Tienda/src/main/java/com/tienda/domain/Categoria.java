package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@Entity
@Table(name = "categoria")
@NoArgsConstructor
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private Long idCategoria;
	private String descripcion;
	private String rutaImagen;
	private boolean activo;


	public Categoria(String categoria, boolean activo) {
		this.descripcion = categoria;
		this.activo = activo;
	}
}
