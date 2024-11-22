package logicaNegocio;

public abstract class Animal {
    
  private String  emitirSonido;
  private String  obtenerDieta;

    public Animal(String emitirSonido, String obtenerDieta) {
        this.emitirSonido = emitirSonido;
        this.obtenerDieta = obtenerDieta;
    }
    
    
    public abstract String emitirSonido(); 
    
    public abstract String obtenerDieta ();
    
    public abstract String TipoHabitat ();

  
}