class Pais {
    String codigoISO;
    String nome;
    long populacao;
    double dimensao; // em km²
    Pais[] vizinhos;
    int numVizinhos;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.vizinhos = new Pais[40]; // Máximo de 40 vizinhos
        this.numVizinhos = 0;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public long getPopulacao() {
        return populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void adicionarVizinho(Pais vizinho) {
        if (numVizinhos < 40) {
            vizinhos[numVizinhos++] = vizinho;
        }
    }

    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoISO() {
        return codigoISO;
    }
}

class Continente {
    private String nome;
    private Pais[] paises;
    private int numPaises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new Pais[100]; // Máximo de 100 países
        this.numPaises = 0;
    }

    public void adicionarPais(Pais pais) {
        if (numPaises < 100) {
            paises[numPaises++] = pais;
        }
    }

    public long populacaoTotal() {
        long total = 0;
        for (int i = 0; i < numPaises; i++) {
            total += paises[i].getPopulacao();
        }
        return total;
    }

    public double dimensaoTotal() {
        double total = 0;
        for (int i = 0; i < numPaises; i++) {
            total += paises[i].getDimensao();
        }
        return total;
    }

    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais paisComMaiorPopulacao() {
        Pais maior = null;
        for (int i = 0; i < numPaises; i++) {
            if (maior == null || paises[i].getPopulacao() > maior.getPopulacao()) {
                maior = paises[i];
            }
        }
        return maior;
    }

    public Pais paisComMenorPopulacao() {
        Pais menor = null;
        for (int i = 0; i < numPaises; i++) {
            if (menor == null || paises[i].getPopulacao() < menor.getPopulacao()) {
                menor = paises[i];
            }
        }
        return menor;
    }
}
