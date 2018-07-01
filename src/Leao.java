public class Leao extends AnimalTerrestre{
    public Leao(){
        setPorte(Porte.MEDIO);
    }

    public Boolean alimentar(Alimento alimento){
        switch (alimento){
            case CARNES:
                System.out.println("Leão: Estou comendo!");
                return true;
            default:
                System.out.println("Leão: Estou com fome! Me alimento apenas de carne.");
                return false;
        }
    }
}
