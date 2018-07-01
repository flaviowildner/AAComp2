public abstract class AnimalAquatico extends AnimalGenerico implements Aquatico {
    public void locomover() {
        this.nadar();
    }

    public void nadar() {
        System.out.println("Estou nadando!\n");
    }
}
