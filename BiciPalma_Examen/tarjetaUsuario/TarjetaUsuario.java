package tarjetaUsuario;

public class TarjetaUsuario {
	private String id = "";
	private Boolean activada = false;
	
	public TarjetaUsuario(){
		
	}
	public TarjetaUsuario(String id, Boolean activada){
		this.id = id;
		this.activada = activada;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	
	public void setActivada(Boolean activada){
		this.activada = activada;
	}
	public Boolean getActivada(){
		return this.activada;
	}
}

