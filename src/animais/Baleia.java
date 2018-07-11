package animais;

import entidades.Alimento;
import entidades.AnimalAquatico;
import entidades.Porte;

public class Baleia extends AnimalAquatico {
    public Baleia(){
        setPorte(Porte.GRANDE);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("animais.Baleia: Estou comendo!");
                return true;
            default:
                System.out.println("animais.Baleia: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
