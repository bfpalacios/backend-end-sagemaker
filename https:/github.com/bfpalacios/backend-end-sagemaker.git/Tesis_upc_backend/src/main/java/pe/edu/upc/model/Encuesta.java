package pe.edu.upc.model;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encuesta")
public class Encuesta {
	
	private long idEncuesta;
    private String respuesta;
    private String recomendacion;
    private String indicador;
    private String estrategia;
    private String estado; 
    private String area;
    
    public Encuesta() {}

	 
	public Encuesta(long idEncuesta, String respuesta, String recomendacion, String indicador, String estrategia,
			String estado, String area) {
		super();
		this.idEncuesta = idEncuesta;
		this.respuesta = respuesta;
		this.recomendacion = recomendacion;
		this.indicador = indicador;
		this.estrategia = estrategia;
		this.estado = estado; 
		this.area = area;
	}
	
 
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdEncuesta() {
		return idEncuesta;
	}

	public void setIdEncuesta(long idEncuesta) {
		this.idEncuesta = idEncuesta;
	}
	
	public String getArea() {
		return area;
	}


	@Column(name = "area", nullable = false)
	public void setArea(String area) {
		this.area = area;
	}


	@Column(name = "indicador", nullable = false)
	public String getIndicador() {
		return indicador;
	}


	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	@Column(name = "estrategia", nullable = false)
	public String getEstrategia() {
		return estrategia;
	}


	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}

	@Column(name = "estado", nullable = false)
	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	} 
	
	@Column(name = "respuesta", nullable = false)
	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	@Column(name = "recomendacion", nullable = false)
	public String getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}
 
    
	 
      
}
