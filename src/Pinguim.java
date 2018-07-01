public class Pinguim extends AnimalAnfibio{
    public Pinguim(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("Pinguim: Estou comendo!");
                return true;
            default:
                System.out.println("Pinguim: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
