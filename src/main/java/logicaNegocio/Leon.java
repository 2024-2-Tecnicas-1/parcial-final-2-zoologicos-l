package logicaNegocio;

public class Leon extends Animal {
    
    @Override
    public String emitirSonido() {
       return "Rugido";
    }

    
    @Override
    public String obtenerDieta() {
        return "Carnivoro";
    }
        
    
}

