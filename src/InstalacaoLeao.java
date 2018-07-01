public class InstalacaoLeao extends Instalacao{
    public InstalacaoLeao(){
        this.setTemperatura(21.5);
        this.setCapacidadeMaxima(3);
        Jaula jaula = new Jaula(20, 30, 25);
        this.setElementosInstalados(jaula);
    }
}
