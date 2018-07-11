package entidades;

public abstract class AnimalAnfibio extends AnimalGenerico implements Anfibio {
    public void locomover(){
        this.nadar();
        this.andar();
    }

    public void andar(){
        System.out.println("Estou andando!\n");
    }

    public void nadar() {
        System.out.println("Estou nadando!\n");
    }
}
