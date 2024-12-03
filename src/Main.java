public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049); // Dimensão em km2
        brasil.setPopulacao(193946886);

        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(45195777);

        Pais chile = new Pais("CHL", "Chile", 756102);
        chile.setPopulacao(19116201);

        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(chile);

        System.out.println("População total da América do Sul: " + americaDoSul.populacaoTotal());
        System.out.println("Dimensão total da América do Sul: " + americaDoSul.dimensaoTotal() + " km2");
        System.out.println("Densidade populacional da América do Sul: " + americaDoSul.densidadePopulacional() + " habitantes/km2");

        Pais maiorPopulacao = americaDoSul.paisComMaiorPopulacao();
        System.out.println("País com maior população: " + maiorPopulacao.getNome() + " (" + maiorPopulacao.getCodigoISO() + "), Dimensão: " + maiorPopulacao.getDimensao() + " km2");

        Pais menorPopulacao = americaDoSul.paisComMenorPopulacao();
        System.out.println("País com menor população: " + menorPopulacao.getNome() + " (" + menorPopulacao.getCodigoISO() + "), Dimensão: " + menorPopulacao.getDimensao() + " km2");
    }
}