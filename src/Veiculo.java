public class Veiculo {
    String marca;
    String modelo;
    Integer anoFabricacao;
    Integer anoModelo;
    Integer quilometragem;
    Double capacidadeTanque;
    Double nivelTanque;

    public Veiculo(String marca, String modelo, Integer anoFabricacao, Integer anoModelo, Integer quilometragem, Double capacidadeTanque, Double nivelTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quilometragem = quilometragem;
        this.capacidadeTanque = capacidadeTanque;
        this.nivelTanque = nivelTanque;
    }

    void mostrarDados() {
        System.out.println("======== \n" + "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoFabricacao + "\n" +
                "Ano do Modelo: " + anoModelo + "\n"  +
                "Km: " + quilometragem + "\n" +
                "Capacidade do Tanque: " + capacidadeTanque + "\n" +
                "Nível do Tanque: " + nivelTanque + "\n" +
                "========");
    }

    void dirigir(Integer distancia, Double consumoMedio) {
        quilometragem += distancia;
        double calc1 = distancia / consumoMedio;
        nivelTanque -= calc1;
        System.out.println("Quilometragem atual: " + quilometragem + " \nLitros Restantes: " + nivelTanque);
    }

    void abastecer(Double litros) {
        nivelTanque += litros;
        System.out.println("Tanque atual: " + nivelTanque);
    }
}
