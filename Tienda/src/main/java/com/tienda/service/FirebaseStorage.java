package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorage {


	public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

	//El BuketName es el <id_del_proyecto>"
	final String BucketName = "techshop-24125.appspot.com";

	//Esta es la ruta básica de este proyecto Techshop
	final String rutaSuperiorStorage = "techshop";

	//Ubicación donde se encuentra el archivo de configuración Json
	final String rutaJsonFile = "firebase";

	//El nombre del archivo Json
	final String archivoJsonFile = "techshop-24125-firebase-adminsdk-poet1-4fd63e5de2.json";

}
