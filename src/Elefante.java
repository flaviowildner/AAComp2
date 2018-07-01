public class Elefante extends AnimalTerrestre{

    public Elefante() {
        setPorte(Porte.GRANDE);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case FRUTAS:
            case VERDURAS:
                System.out.println("Estou comendo!");
                return true;
            default:
                System.out.println("Me alimento com frutas ou verduras. Estou com fome!");
                return false;
        }
    }
}
