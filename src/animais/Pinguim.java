package animais;

import entidades.Alimento;
import entidades.AnimalAnfibio;
import entidades.Porte;

public class Pinguim extends AnimalAnfibio {
    public Pinguim(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("animais.Pinguim: Estou comendo!");
                return true;
            default:
                System.out.println("animais.Pinguim: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
