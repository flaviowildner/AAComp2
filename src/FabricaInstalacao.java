public class FabricaInstalacao {
    public InstalacaoBaleia criarInstalacaoBaleia(){
        InstalacaoBaleia instalacaoBaleia = new InstalacaoBaleia(19.0,2,1000.0);
        return instalacaoBaleia;
    }

    public InstalacaoElefante criarInstalacaoElefante(){
        InstalacaoElefante instalacaoElefante = new InstalacaoElefante(23.0,2,20.0,30.0,25.0);
        return instalacaoElefante;
    }

    public InstalacaoFoca criarInstalacaoFoca(){
        InstalacaoFoca instalacaoFoca = new InstalacaoFoca(15.0,5,100.0);
        return instalacaoFoca;
    }

    public InstalacaoLeao criarInstalacaoLeao(){
        InstalacaoLeao instalacaoLeao = new InstalacaoLeao(21.5,3,20,30,25);
        return instalacaoLeao;
    }

    public InstalacaoMacaco criarInstalacaoMacaco(){
        InstalacaoMacaco instalacaoMacaco = new InstalacaoMacaco(25.0,10,40.0,35.7,90);
        return instalacaoMacaco;
    }

    public InstalacaoPeixeBoi criarInstalacaoPeixeBoi(){
        InstalacaoPeixeBoi instalacaoPeixeBoi = new InstalacaoPeixeBoi(18.0,7,750.0);
        return instalacaoPeixeBoi;
    }

    public InstalacaoPinguim criarInstalacaoPinguim(){

    }

}
