package animais;

import entidades.Alimento;
import entidades.AnimalTerrestre;
import entidades.Porte;

public class Macaco extends AnimalTerrestre {
    public Macaco(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case FRUTAS:
                System.out.println("animais.Macaco: Estou comendo!");
                return true;
            default:
                System.out.println("animais.Macaco: Estou com fome! Me alimento apenas de frutas.");
                return false;
        }
    }
}
