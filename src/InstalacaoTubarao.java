public class InstalacaoTubarao extends Instalacao {
    public InstalacaoTubarao(double temperatura, int capacidadeMaxima, double volumeEmLitros){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Tanque tanque = new Tanque(volumeEmLitros);
        this.setElementosInstalados(tanque);
    }
}
