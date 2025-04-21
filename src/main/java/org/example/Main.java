public class Main {
    public static void main(String[] args) {
        CampeonatoService cs = new CampeonatoServiceImpl();

        cs.registrarTime("Estrelas FC", "São Paulo");
        cs.registrarTime("Guerreiras da Bola", "Rio de Janeiro");

        cs.adicionarJogadora("Estrelas FC", "Ana", 22, "Atacante", 9);
        cs.adicionarJogadora("Guerreiras da Bola", "Bruna", 24, "Goleira", 1);

        cs.registrarJogo("Estrelas FC", "Guerreiras da Bola", 2, 1);
        cs.registrarJogo("Guerreiras da Bola", "Estrelas FC", 0, 0);

        cs.exibirClassificacao();
    }
}