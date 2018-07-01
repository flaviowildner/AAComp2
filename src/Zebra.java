public class Zebra extends AnimalTerrestre{
    public Zebra(){
        setPorte(Porte.MEDIO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case FRUTAS:
            case VERDURAS:
                System.out.println("Estou comendo!");
                return true;
            default:
                System.out.println("Estou com fome! Me alimento apenas de frutas e verduras.");
                return false;
        }
    }
}
