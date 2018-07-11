package entidades;

import instalacoes.Instalacao;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Instalacao> instalacoesZoologico = new ArrayList<Instalacao>();

    public void adicionarInstalacao(Instalacao instalacao){
        for (int i=0;i<this.instalacoesZoologico.size();i++){
            if(instalacoesZoologico.get(i).getLocalizacao() == instalacao.getLocalizacao()){
                throw new RuntimeException("Localização já utilizada");
            }
        }
        instalacoesZoologico.add(instalacao);
    }

    public ArrayList<Instalacao> getInstalacoesZoologico(){
        return instalacoesZoologico;
    }
}
