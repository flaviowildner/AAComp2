package instalacoes;

import entidades.Tanque;

public class InstalacaoFoca extends Instalacao {
    public InstalacaoFoca(double temperatura, int capacidadeMaxima, double volumeEmLitros){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Tanque tanque = new Tanque(volumeEmLitros);
        this.setElementosInstalados(tanque);
    }
}
