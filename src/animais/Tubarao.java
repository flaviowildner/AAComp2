package animais;

import entidades.Alimento;
import entidades.AnimalAquatico;
import entidades.Porte;

public class Tubarao extends AnimalAquatico {
    public Tubarao(){
        setPorte(Porte.GRANDE);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
            case CARNES:
                System.out.println("animais.Tubarao: Estou comendo!");
                return true;
            default:
                System.out.println("animais.Tubarao: Estou com fome! Me alimento apenas de carnes, e peixes.");
                return false;
        }
    }
}
