public class InstalacaoBaleia extends Instalacao {
    public InstalacaoBaleia(){
        this.setTemperatura(19.0);
        this.setCapacidadeMaxima(2);
        Tanque tanque = new Tanque(1000.0);
        this.setElementosInstalados(tanque);
    }
}
