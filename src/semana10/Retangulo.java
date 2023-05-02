package semana10;

// Classe - Representa um conceito/ abstração
// que deve ser implementado no programa
public class Retangulo {
    
    // Atributos
    public double base;
    public double altura;

    //Metodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

