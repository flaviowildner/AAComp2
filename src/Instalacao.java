import java.util.ArrayList;

public abstract class Instalacao {
    private int         capacidadeMaxima;
    private Localizacao localizacao;
    private Double      temperatura;
    private ArrayList<AnimalGenerico>       animaisInstalados;
    private ArrayList<ElementoInstalacao>   elementosInstalados;


    public Instalacao(){
        this.animaisInstalados = new ArrayList<>();
        this.elementosInstalados = new ArrayList<>();
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public ArrayList<AnimalGenerico> getAnimaisInstalados() {
        return animaisInstalados;
    }

    public void setAnimaisInstalados(AnimalGenerico animal) {
        if(capacidadeMaxima > this.animaisInstalados.size()){
            this.animaisInstalados.add(animal);
        }else{
            throw new RuntimeException("Capacidade de animais atingida");
        }
    }

    public ArrayList<ElementoInstalacao> getElementosInstalados() {
        return elementosInstalados;
    }

    public void setElementosInstalados(ElementoInstalacao elementoInstalacao) {
        this.elementosInstalados.add(elementoInstalacao);
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }



    public boolean instalaAnimal(AnimalGenerico animal){
        return this.animaisInstalados.add(animal);
    }
}
