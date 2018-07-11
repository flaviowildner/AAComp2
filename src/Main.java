import animais.Elefante;
import animais.Macaco;
import entidades.Alimento;
import entidades.AnimalGenerico;
import entidades.Localizacao;
import entidades.Zoologico;
import instalacoes.FabricaInstalacao;
import instalacoes.InstalacaoElefante;
import instalacoes.InstalacaoMacaco;

public class Main {
    private static void testarElefante(){
        System.out.println("Testando elefante:");
        InstalacaoElefante instalacaoElefante = FabricaInstalacao.criarInstalacaoElefante();
        AnimalGenerico elefante = new Elefante();

        instalacaoElefante.setAnimaisInstalados(elefante);
        instalacaoElefante.setAnimaisInstalados(elefante);
        instalacaoElefante.getAnimaisInstalados().get(0).locomover();
        instalacaoElefante.getAnimaisInstalados().get(0).alimentar(Alimento.FRUTAS);
        instalacaoElefante.getAnimaisInstalados().get(0).alimentar(Alimento.CARNES);
    }

    private static void testarMacaco(){
        System.out.println("Testando macaco:");
        InstalacaoMacaco instalacaoMacaco = FabricaInstalacao.criarInstalacaoMacaco();
        AnimalGenerico macaco = new Macaco();

        instalacaoMacaco.setAnimaisInstalados(macaco);
        instalacaoMacaco.setAnimaisInstalados(macaco);
        instalacaoMacaco.getAnimaisInstalados().get(0).locomover();
        instalacaoMacaco.getAnimaisInstalados().get(0).alimentar(Alimento.FRUTAS);
        instalacaoMacaco.getAnimaisInstalados().get(0).alimentar(Alimento.CARNES);
    }

    public static void main(String[] args){
        testarElefante();
        testarMacaco();

        Zoologico zoologico = new Zoologico();
        InstalacaoElefante instalacaoElefante = FabricaInstalacao.criarInstalacaoElefante();
        instalacaoElefante.setLocalizacao(Localizacao.LESTE);
        zoologico.adicionarInstalacao(instalacaoElefante);

        InstalacaoMacaco instalacaoMacaco = FabricaInstalacao.criarInstalacaoMacaco();
        instalacaoMacaco.setLocalizacao(Localizacao.CENTROESTE);
        zoologico.adicionarInstalacao(instalacaoMacaco);

        System.out.println(zoologico.getInstalacoesZoologico().get(0).getLocalizacao());
    }
}