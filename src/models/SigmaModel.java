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
    	setNome(nome);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SigmaModel{")
          .append("nome='").append(getNome()).append('\'')
          .append(", rizzler='").append(getRizzler()).append('\'')
          .append(", amostradinho=").append(getAmostradinho())
          .append(", aura=").append(getAura())
          .append('}');
        return sb.toString();
    }
}