
import logicaNegocio.Animal;
import logicaNegocio.Delfin;
import logicaNegocio.Leon;
import logicaNegocio.Perro;


public class Principal {
  public static void main(String[] args) {
      
        Animal perro = new Perro();
        Animal delfin = new Delfin();
        Animal leon = new Leon ();
        
        Animal[] animales = new Animal[10];
        
        animales[0] = new Perro();
        animales[1] = new Delfin();
        animales[4] = new Leon();

        for(int i=0; i< animales.length;i++){
            if(animales[i] != null){
                String sonido = animales[i].emitirSonido();
                System.out.println("El animal en la posición " + i + " hace " + sonido);
            }
            else{
                System.out.println("No hay un animal en la posición " + i);
            }
        }
        
    }
}  
