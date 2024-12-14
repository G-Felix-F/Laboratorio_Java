package models;

public class SigmaModel extends SkibidiToiletModel {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validateNome(nome);
        this.nome = nome;
    }

    private void validateNome(String nome) {
        if (nome.equalsIgnoreCase("Hugo") || nome.equalsIgnoreCase("Horck")) {
            setAmostradinho(false);
            setAura(1000L);
        } else {
            setAmostradinho(true);
            setAura(getAura() / 2);
        }
    }

    public SigmaModel(String nome, String rizzler, Boolean amostradinho, Long aura) {
        super(rizzler, amostradinho, aura);
    }
    
    @Override
    public String toString() {
        return "SigmaModel{" +
               "nome='" + nome + '\'' +
               ", rizzler='" + getRizzler() + '\'' +
               ", amostradinho=" + getAmostradinho() +
               ", aura=" + getAura() +
               '}';
    }
}