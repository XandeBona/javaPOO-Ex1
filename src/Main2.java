import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca = "";
        String modelo = "";
        Integer anoFabricacao = 0;
        Integer anoModelo = 0;
        Integer quilometragem = 0;
        Double capacidadeTanque = 0.0;
        Double nivelTanque = 0.0;

        System.out.println("=== ESCOLHA UMA OPÇÃO ===");
        System.out.println("1 - Cadastrar carro");
        System.out.println("2 - Cálculo Litros Disponíveis");
        System.out.println("3 - Cálculo Abastecimento");
        System.out.println("4 - Dados Atuais do Carro");

        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();

        Veiculo veiculo = new Veiculo(marca, modelo, anoFabricacao, anoModelo, quilometragem, capacidadeTanque, nivelTanque);

        while (escolha != 0) {

            //cadastro de carro
            if (escolha == 1) {
                sc.nextLine();
                System.out.println("== Informe os dados do carro ==");
                System.out.print("Marca: ");
                marca = sc.nextLine();
                System.out.print("Modelo: ");
                modelo = sc.nextLine();
                System.out.print("Ano de fabricação: ");
                anoFabricacao = sc.nextInt();
                System.out.print("Ano do modelo: ");
                anoModelo = sc.nextInt();
                System.out.print("Quilometragem: ");
                quilometragem = sc.nextInt();
                System.out.print("Capacidade do tanque: ");
                capacidadeTanque = sc.nextDouble();
                System.out.print("Nível do tanque: ");
                nivelTanque = sc.nextDouble();
                System.out.println("=== Cadastrado com sucesso ===");
                System.out.println();

                veiculo = new Veiculo(marca, modelo, anoFabricacao, anoModelo, quilometragem, capacidadeTanque, nivelTanque);
            }

            //dirigir
            if (escolha == 2) {
                System.out.println("== Insira a distância e o consumo médio ==");
                System.out.print("Distância: ");
                Integer distancia = sc.nextInt();
                System.out.print("Consumo médio: ");
                Double consumoMedio = sc.nextDouble();
                veiculo.dirigir(distancia, consumoMedio);
                System.out.println("=== Dados atualizados com sucesso ===");
                System.out.println();
            }

            //abastecer
            if (escolha == 3) {
                System.out.print("Insira a quantidade de gasolina a ser colocada no veículo: ");
                Double litros = sc.nextDouble();
                veiculo.abastecer(litros);
                System.out.println("=== Dados atualizados com sucesso ===");
                System.out.println();
            }

            //mostra os dados do veiculo
            if (escolha == 4) {
                veiculo.mostrarDados();
            }

            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();

        }
    }
}
