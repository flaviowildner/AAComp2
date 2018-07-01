public class Tartaruga extends AnimalAnfibio {
    public Tartaruga(){
        setPorte(Porte.PEQUENO);
    }

    public Boolean alimentar(Alimento alimento) {
        switch (alimento){
            case FRUTAS:
            case VERDURAS:
            case PEIXES:
                System.out.println("Tartaruga: Estou comendo!");
                return true;
            default:
                System.out.println("Tartaruga: Estou com fome! Me alimento apenas de frutas, verduras, e peixes.");
                return false;
        }
    }
}
