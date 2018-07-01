public class InstalacaoMacaco extends Instalacao{
    public InstalacaoMacaco(){
        this.setTemperatura(25.0);
        this.setCapacidadeMaxima(10);
        Jaula jaula = new Jaula(40, 35.7, 90);
        this.setElementosInstalados(jaula);
    }
}
