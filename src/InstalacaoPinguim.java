public class InstalacaoPinguim extends Instalacao {
    public InstalacaoPinguim(){
        this.setTemperatura(15.0);
        this.setCapacidadeMaxima(25);
        Tanque tanque = new Tanque(100.0);
        this.setElementosInstalados(tanque);
    }
}
