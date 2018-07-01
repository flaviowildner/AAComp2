public class Main {
    private static void testarElefante(){
        InstalacaoElefante instalacaoElefante = new InstalacaoElefante();
        AnimalGenerico elefante = new Elefante();

        instalacaoElefante.setAnimaisInstalados(elefante);
        instalacaoElefante.setAnimaisInstalados(elefante);
        instalacaoElefante.getAnimaisInstalados().get(0).locomover();
        instalacaoElefante.getAnimaisInstalados().get(0).alimentar(Alimento.FRUTAS);
        instalacaoElefante.getAnimaisInstalados().get(0).alimentar(Alimento.CARNES);
    }

    private static void testarMacaco(){
        InstalacaoMacaco instalacaoElefante = new InstalacaoMacaco();
        AnimalGenerico macaco = new Macaco();

        instalacaoElefante.setAnimaisInstalados(macaco);
        instalacaoElefante.setAnimaisInstalados(macaco);
        instalacaoElefante.getAnimaisInstalados().get(0).locomover();
        instalacaoElefante.getAnimaisInstalados().get(0).alimentar(Alimento.FRUTAS);
        instalacaoElefante.getAnimaisInstalados().get(0).alimentar(Alimento.CARNES);
    }

    private static void testarTartaruga(){

    }

    public static void main(String[] args){
        testarElefante();
        testarMacaco();
    }
}