package semana14;

public class Quadrado {
    public double lado;

    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    //Getters
    // public TIPO_ATRIBUTO getNOME_ATRIBUTO() {
    //      return ATRIBUTO;
    // }

    public double getLado(){
        return lado;
    }

    //Setters

    public void setLado(double lado){
        if (lado <= 0.0){
            throw new RuntimeException("Lado inválido");
        }
         
        this.lado = lado;
    }
}
