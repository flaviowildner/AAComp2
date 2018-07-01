public abstract class AnimalTerrestre extends AnimalGenerico implements Terrestre{
    public void locomover(){
        this.andar();
    }

    public void andar(){
        System.out.println("Estou andando!\n");
    }
}
