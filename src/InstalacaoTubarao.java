public class InstalacaoTubarao extends Instalacao {
    public InstalacaoTubarao(){
        this.setTemperatura(22.0);
        this.setCapacidadeMaxima(2);
        Tanque tanque = new Tanque(500.0);
        this.setElementosInstalados(tanque);
    }
}
