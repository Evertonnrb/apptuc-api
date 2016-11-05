package br.com.fabricadeprogramador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabricadeprogramador.model.LatLng;

public interface LatLngRepository extends JpaRepository<LatLng, Long> {

}
