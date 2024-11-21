package logicaNegocio;

public abstract class Animal {
    
    private String emitirSonido;
    private String obtenerDieta;

    public Animal(String emitirSonido) {
        this.emitirSonido = emitirSonido;
        this.obtenerDieta = obtenerDieta;
    }

    public String getEmitirSonido() {
        return emitirSonido;
    }

    public void setEmitirSonido(String emitirSonido) {
        this.emitirSonido = emitirSonido;
    }

    public String getObtenerDieta() {
        return obtenerDieta;
    }

    public void setObtenerDieta(String obtenerDieta) {
        this.obtenerDieta = obtenerDieta;
    }
    
}

