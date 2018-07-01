public class Baleia extends AnimalAquatico {
    public Baleia(){
        setPorte(Porte.GRANDE);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("Baleia: Estou comendo!");
                return true;
            default:
                System.out.println("Baleia: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
