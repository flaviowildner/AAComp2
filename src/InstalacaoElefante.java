public class InstalacaoElefante extends Instalacao {
    public InstalacaoElefante(){
        this.setTemperatura(23.0);
        this.setCapacidadeMaxima(2);
        Jaula jaula = new Jaula(20, 30, 25);
        this.setElementosInstalados(jaula);
    }
}