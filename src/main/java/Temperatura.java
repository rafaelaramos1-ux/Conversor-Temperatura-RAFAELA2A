// CLASSE PAI - AS OUTRAS VÃO HERDAR
public class Temperatura {
// ATRIBUTO
    private double graus;
    
// CONSTRUTOR
    public Temperatura(double valorGraus) {
        this.graus = valorGraus;
    }

//GETTER DO GRAUS
    public double getGraus() {
        return graus;
    }

//SETTER NO GRAUS
    public void steGraus(double novoGraus) {
        this.graus = novoGraus;
    }
}
