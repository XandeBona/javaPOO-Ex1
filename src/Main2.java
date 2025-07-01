import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do carro");
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ano de fabricação: ");
        Integer anoFabricacao = sc.nextInt();
        System.out.print("Ano do modelo: ");
        Integer anoModelo = sc.nextInt();
        System.out.print("Quilometragem: ");
        Integer quilometragem = sc.nextInt();
        System.out.print("Capacidade do tanque: ");
        Double capacidadeTanque = sc.nextDouble();
        System.out.print("Nível do tanque: ");
        Double nivelTanque = sc.nextDouble();

        Veiculo veiculo = new Veiculo(marca, modelo, anoFabricacao, anoModelo, quilometragem, capacidadeTanque, nivelTanque);

        veiculo.mostrarDados();

        //dirigir
        System.out.println("Insira a distância e o consumo médio");
        System.out.print("Distância: ");
        Integer distancia = sc.nextInt();
        System.out.print("Consumo médio: ");
        Double consumoMedio = sc.nextDouble();
        veiculo.dirigir(distancia, consumoMedio);

        //abastecer
        System.out.println("===============");
        System.out.print("Insira a quantidade de gasolina a ser colocada no veículo: ");
        Double litros = sc.nextDouble();
        veiculo.abastecer(litros);

        System.out.println("=================");
        System.out.println("=================");
        System.out.println("=================");
        veiculo.mostrarDados();
    }
}