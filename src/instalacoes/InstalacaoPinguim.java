package instalacoes;

import entidades.Tanque;

public class InstalacaoPinguim extends Instalacao {
    public InstalacaoPinguim(double temperatura, int capacidadeMaxima, double volumeEmLitros){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Tanque tanque = new Tanque(volumeEmLitros);
        this.setElementosInstalados(tanque);
    }
}