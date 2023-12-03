package com.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.clinica.entity.Area;
import com.clinica.services.SerArea;


@RestController
@RequestMapping("/api")
public class CtrlArea {
	@Autowired
	private SerArea ser;
	// listarareas
	@GetMapping("/areas")
	public List<Area> index() {
		return ser.findAll();
	}
	// buscarareas
	@GetMapping("/areas/{id_area}")
	public Area show(@PathVariable Long id_area) {
		return ser.findById(id_area);
	}
	// insertareras
	@PostMapping("/areas")
	@ResponseStatus(HttpStatus.CREATED)
	public Area create(@RequestBody Area area) {
		return ser.save(area);
	}
	// editararea
	@PutMapping("/areas/{id_area}")
	public Area update(@RequestBody Area area, @PathVariable Long id_area) {
		Area areaActual = ser.findById(id_area);
		areaActual.setNombre_area(area.getNombre_area());
		return ser.save(areaActual);

	}
	// eliminar una parroquia
	@DeleteMapping("/areas/{id_area}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_area) {
		ser.delete(id_area);
	}

}
