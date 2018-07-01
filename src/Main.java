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
    }
}