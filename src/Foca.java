public class Foca extends AnimalAnfibio {
    public Foca(){
        setPorte(Porte.MEDIO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case PEIXES:
                System.out.println("Foca: Estou comendo!");
                return true;
            default:
                System.out.println("Foca: Estou com fome! Me alimento apenas de peixes.");
                return false;
        }
    }
}
