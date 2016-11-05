package br.com.fabricadeprogramador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.model.LatLng;
import br.com.fabricadeprogramador.repository.LatLngRepository;

@RestController
public class MapController {

	@Autowired
	LatLngRepository repository;
	
	@GetMapping("/mapas")
	private List<LatLng> buscarLacais(){
		return  repository.findAll();
		
	}
	
	@PostMapping("/mapas")
	private LatLng salvar(@RequestBody LatLng latLng){
		return repository.save(latLng);
	}
}
