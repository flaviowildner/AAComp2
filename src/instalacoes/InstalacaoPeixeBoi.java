package instalacoes;

import entidades.Tanque;

public class InstalacaoPeixeBoi extends Instalacao {
    public InstalacaoPeixeBoi(double temperatura, int capacidadeMaxima, double volumeEmLitros){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Tanque tanque = new Tanque(volumeEmLitros);
        this.setElementosInstalados(tanque);
    }
}
