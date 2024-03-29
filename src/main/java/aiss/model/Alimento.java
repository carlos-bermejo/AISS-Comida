package aiss.model;

public class Alimento {
	
	//ENUM
	enum Categorias {}
	enum TipoAlimento{}
	enum Alergeno{}
	enum Temporada{}
	
	//ATRIBUTOS
	private String id;
	private String nombre;
	private Double calorias;
	private Categorias categoria;
	private TipoAlimento tipo;
	private Alergeno alergeno; //opcional?
	private Temporada temporada; //opcional
	
	//CONSTRUCTORES
	public Alimento () {}
	
	public Alimento (String nombre) {
		this.nombre = nombre;
	}
	
	public Alimento (String id, String nombre) {
		this.nombre = nombre;
	}	

	//GETTERS Y SETTERS
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public TipoAlimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoAlimento tipo) {
		this.tipo = tipo;
	}

	public Alergeno getAlergeno() {
		return alergeno;
	}

	public void setAlergeno(Alergeno alergeno) {
		this.alergeno = alergeno;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}
	
}
