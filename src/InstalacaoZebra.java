public class InstalacaoZebra extends Instalacao {
    public InstalacaoZebra(){
        this.setTemperatura(24.0);
        this.setCapacidadeMaxima(2);
        Jaula jaula = new Jaula(20, 30, 25);
        this.setElementosInstalados(jaula);
    }
}
