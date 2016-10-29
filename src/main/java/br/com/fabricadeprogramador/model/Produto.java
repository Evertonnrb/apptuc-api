package br.com.fabricadeprogramador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Integer id;
    private String codigoBarra;
    private String descricao;
    private Double valor;

    
}
