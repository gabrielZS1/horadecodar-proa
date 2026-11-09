import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
        System.out.println("Objetivo: fazer o seu bichinho chegar à idade 50.");
        System.out.println("Você perde se a fome ou o cansaço chegarem a 100, ou se a felicidade chegar a 0.");

        System.out.println("Digite o nome do seu animal de estimação:");
        String nomePet = entrada.nextLine();

        BichinhoVirtual pet = new BichinhoVirtual(nomePet);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + pet.nome);
            System.out.println("2. Brincar com " + pet.nome);
            System.out.println("3. Fazer " + pet.nome + " descansar");
            System.out.println("4. Verificar o status de " + pet.nome);
            System.out.println("5. Sair");

            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    pet.alimentar();
                    break;
                case 2:
                    pet.brincar();
                    break;
                case 3:
                    pet.descansar();
                    break;
                case 4:
                    pet.verificarStatus();
                    continue;
                case 5:
                    System.out.println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!");
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    continue;
            }

            pet.passarTempo();

            if (pet.nivelDeFome >= 100) {
                System.out.println("\n" + pet.nome + " ficou com tanta fome que não aguentou. Você perdeu!");
                continuar = false;
            } else if (pet.nivelCansaco >= 100) {
                System.out.println("\n" + pet.nome + " ficou exausto e não aguentou. Você perdeu!");
                continuar = false;
            } else if (pet.nivelFelicidade <= 0) {
                System.out.println("\n" + pet.nome + " ficou muito triste. Você perdeu!");
                continuar = false;
            } else if (pet.idade >= 50) {
                System.out.println("\nParabéns! " + pet.nome + " chegou à idade 50. Você venceu!");
                continuar = false;
            }
        }

        entrada.close();
    }
}
