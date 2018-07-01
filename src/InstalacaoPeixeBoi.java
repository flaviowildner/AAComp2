public class InstalacaoPeixeBoi extends Instalacao{
    public InstalacaoPeixeBoi(){
        this.setTemperatura(18.0);
        this.setCapacidadeMaxima(7);
        Tanque tanque = new Tanque(750.0);
        this.setElementosInstalados(tanque);
    }
}
