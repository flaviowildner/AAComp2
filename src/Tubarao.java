public class Tubarao extends AnimalAquatico {
    public Tubarao(){
        setPorte(Porte.GRANDE);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
            case CARNES:
                System.out.println("Tubarao: Estou comendo!");
                return true;
            default:
                System.out.println("Tubarao: Estou com fome! Me alimento apenas de carnes, e peixes.");
                return false;
        }
    }
}
