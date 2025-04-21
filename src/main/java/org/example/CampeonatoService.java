public interface CampeonatoService {
    void registrarTime(String nome, String cidade);
    void adicionarJogadora(String nomeTime, String nome, int idade, String posicao, int numero);
    void registrarJogo(String timeA, String timeB, int golsA, int golsB);
    void exibirClassificacao();
    int getPontos(String nomeTime);
}