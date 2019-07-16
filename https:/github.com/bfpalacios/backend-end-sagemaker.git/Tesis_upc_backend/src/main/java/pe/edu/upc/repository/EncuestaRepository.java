package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Encuesta;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Long>{

 
}

