package br.com.fabricadeprogramador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fabricadeprogramador.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	@Query("select p from Produto p where p.codigoBarra=:cod")
	Produto buscar(@Param("cod") String codigoBarra);

}
