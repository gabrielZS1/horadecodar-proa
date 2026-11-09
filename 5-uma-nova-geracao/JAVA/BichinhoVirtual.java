import java.util.Scanner;

class BichinhoVirtual {

    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int nivelCansaco = 0;
    int idade = 0;

    public BichinhoVirtual(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome = limitar(nivelDeFome - 10);
        System.out.println(this.nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade = limitar(nivelFelicidade + 10);
        nivelCansaco = limitar(nivelCansaco + 10);
        System.out.println(this.nome + " está brincando e se sentindo mais feliz, mas ficou mais cansado.");
    }

    public void descansar() {
        nivelCansaco = limitar(nivelCansaco - 40);
        System.out.println(this.nome + " descansou. O nível de cansaço diminuiu.");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + this.nome + ":");
        System.out.println("Idade: " + this.idade);
        System.out.println("Nível de fome: " + this.nivelDeFome);
        System.out.println("Nível de felicidade: " + this.nivelFelicidade);
        System.out.println("Nível de cansaço: " + this.nivelCansaco);
    }

    public void passarTempo() {
        nivelDeFome = limitar(nivelDeFome + 3);
        nivelFelicidade = limitar(nivelFelicidade - 3);
        nivelCansaco = limitar(nivelCansaco + 10);
        idade = idade + 1;
        System.out.println("O tempo passou e " + this.nome + " ficou mais velho, mais faminto, mais cansado e menos feliz.");
    }

    private int limitar(int valor) {
        if (valor < 0) {
            return 0;
        }
        if (valor > 100) {
            return 100;
        }
        return valor;
    }
}
