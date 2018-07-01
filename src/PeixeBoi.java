public class PeixeBoi extends AnimalAquatico {
    public PeixeBoi(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("PeixeBoi: Estou comendo!");
                return true;
            default:
                System.out.println("PeixeBoi: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
