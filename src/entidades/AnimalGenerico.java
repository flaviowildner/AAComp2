package entidades;

public abstract class AnimalGenerico implements Animal{
    private Porte porte;
    private Sexo sexo;

    public abstract Boolean alimentar(Alimento alimento);
    public abstract void locomover();

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
