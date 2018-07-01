public class InstalacaoFoca extends Instalacao {
    public InstalacaoFoca(){
        this.setTemperatura(15.0);
        this.setCapacidadeMaxima(5);
        Tanque tanque = new Tanque(100.0);
        this.setElementosInstalados(tanque);
    }
}
