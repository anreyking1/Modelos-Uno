package ejecutable;

import Fabricas.*;
import armasAtaque.ArmaAtaque;
import armasDefensa.ArmaDefensa;
import cuerpos.Cuerpo;

public class Personaje {

    private final int datos;
    private Fabricas.FabricaPersonajes fabrica;
    private Cuerpo cuerpo;
    private ArmaAtaque armaA;
    private ArmaDefensa armaD;

    public Personaje(int entrada) {
        datos = entrada;
    }

    public void llamarPersonaje() {
        
        switch (datos) {
            case 1:
                fabrica = new FabricaHumano();
                break;
            case 2:
                fabrica = new FabricaElfo();
                break;
            case 3:
                fabrica = new FabricaMago();
                break;
            default:
                fabrica = new FabricaTrol();
                break;
        }
        
        cuerpo = fabrica.darCuerpo();
        armaA = fabrica.darArmaAtaque();
        armaD = fabrica.darArmaDefensa();

    }

    public String urlCuerpo() {
        return cuerpo.imagenCuerpo();
    }

    public String urlArmaAtaque() {
        return armaA.imagenArmaAtaque();
    }

    public String urlArmaDefensa() {
        return armaD.imagenArmaDefensa();
    }
}
