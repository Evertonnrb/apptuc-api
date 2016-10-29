package br.com.fabricadeprogramador.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.model.Produto;
import br.com.fabricadeprogramador.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
    ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos/{cod}")
	private Produto localizar(@PathVariable("cod")  String codigoBarra){
		return produtoRepository.buscar(codigoBarra);
		
	}
	
	@PostMapping("/produtos")
	private Produto salvar(@RequestBody Produto produto){
		
		return produtoRepository.save(produto);
	} 
	
	
	
}
