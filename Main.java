public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2020);
        carro.setNumeroDePortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB500");
        moto.setAno(2019);
        moto.setTipoDeGuidao("Esportivo");

        System.out.println("Detalhes do carro:");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da moto:");
        moto.exibirDetalhes();
    }
}
