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
import com.clinica.entity.Provincia;
import com.clinica.services.IProvinciaServices;

@RestController
@RequestMapping("/api")
public class ProvinciaRestController {

	@Autowired
	private IProvinciaServices provinciaServices;

	@GetMapping("/provincias")
	public List<Provincia> index() {
		return provinciaServices.findAll();
	}

	// buscar un provincia por id
	@GetMapping("/provincias/{id_provincia}")
	public Provincia show(@PathVariable Long id_provincia) {
		return provinciaServices.findById(id_provincia);
	}
	

	// insertar un provincia
	@PostMapping("/provincias")
	@ResponseStatus(HttpStatus.CREATED)
	public Provincia create(@RequestBody Provincia provincia) {
		return provinciaServices.save(provincia);
	}

	// editar un provida
	@PutMapping("/provincias/{id_provincia}")
	public Provincia update(@RequestBody Provincia provincia, @PathVariable Long id_provincia) {
		Provincia provinciaActual = provinciaServices.findById(id_provincia);
		provinciaActual.setNombre_provincia(provincia.getNombre_provincia());
		return provinciaServices.save(provinciaActual);
	}
	//eliminar una provincia
		@DeleteMapping("/provincias/{id_provincia}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id_provincia) {
			provinciaServices.delete(id_provincia);
		}
		
}
