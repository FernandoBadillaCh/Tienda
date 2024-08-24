package com.tienda.controller;

import com.tienda.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequestMapping("/reportes")
public class ReporteController {

	@Autowired
	ReporteService reporteSerivce;

	@GetMapping("/principal")
	public String principal(Model model) {
		return "/reportes/principal";
	}

	@GetMapping("/usuarios")
	public ResponseEntity<Resource> usuarios(@RequestParam String tipo) throws IOException {

		return reporteSerivce.generaReporte("usuarios", null, tipo);
	}

	@GetMapping("/ventas")
	public ResponseEntity<Resource> ventas(@RequestParam String tipo) throws IOException {

		return reporteSerivce.generaReporte("ventas", null, tipo);
	}
}