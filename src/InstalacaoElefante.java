public class InstalacaoElefante extends Instalacao {
    public InstalacaoElefante(double temperatura, int capacidadeMaxima, double altura, double largura, double comprimento){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Jaula jaula = new Jaula(altura, largura, comprimento);
        this.setElementosInstalados(jaula);
    }
}