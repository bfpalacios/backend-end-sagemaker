package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.exception.ResourceNotFoundException;
import pe.edu.upc.model.Encuesta;
import pe.edu.upc.repository.EncuestaRepository;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/v1")
public class EncuestaController {
	
	@Autowired
    private EncuestaRepository encuestaRepository;

    @GetMapping("/encuesta")
    public List<Encuesta> getAllEncuesta() {
    	
    	List<Encuesta> encuesta = encuestaRepository.findAll();
    	
    	System.out.print("respuesta " + encuesta.get(0).getRespuesta());
    	
        return encuesta;
    }

    @GetMapping("/encuesta/{id}")
    public ResponseEntity<Encuesta> getClienteById(@PathVariable(value = "id") Long clienteId)
        throws ResourceNotFoundException {
        Encuesta encuesta = encuestaRepository.findById(clienteId)
          .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado para el id: ==>" + clienteId));
        return ResponseEntity.ok().body(encuesta);
    }

}
