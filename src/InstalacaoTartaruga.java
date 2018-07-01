public class InstalacaoTartaruga extends Instalacao {
    public InstalacaoTartaruga(){
        this.setTemperatura(20.0);
        this.setCapacidadeMaxima(17);
        Tanque tanque = new Tanque(200.0);
        this.setElementosInstalados(tanque);
    }
}
