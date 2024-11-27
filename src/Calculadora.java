public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;

    // Métodos
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}