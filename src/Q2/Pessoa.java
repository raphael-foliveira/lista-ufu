package Q2;

class Pessoa {
    String name;
    int idade;
    double altura;

    Pessoa(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    void printContato() {
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Idade: %d\n", this.idade);
        System.out.printf("Altura: %.2f\n", this.altura);
    }
}
