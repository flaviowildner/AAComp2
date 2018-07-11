package animais;

import entidades.Alimento;
import entidades.AnimalAquatico;
import entidades.Porte;

public class PeixeBoi extends AnimalAquatico {
    public PeixeBoi(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("animais.PeixeBoi: Estou comendo!");
                return true;
            default:
                System.out.println("animais.PeixeBoi: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
