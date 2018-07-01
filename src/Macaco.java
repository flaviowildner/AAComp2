public class Macaco extends AnimalTerrestre {
    public Macaco(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case FRUTAS:
                System.out.println("Estou comendo!");
                return true;
            default:
                System.out.println("Estou com fome! Me alimento apenas de frutas.");
                return false;
        }
    }
}
