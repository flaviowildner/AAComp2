import java.util.ArrayList;

public class Zoologico {
    ArrayList<Instalacao> instalacoesZoologico;

    public void adicionarInstalacao(Instalacao instalacao){
        for (int i=0;i<instalacoesZoologico.size();i++){
            if(instalacoesZoologico.get(i).getLocalizacao() == instalacao.getLocalizacao()){
                throw new RuntimeException();
            }
        }
        instalacoesZoologico.add(instalacao);
    }
}
