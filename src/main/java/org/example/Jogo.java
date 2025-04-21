public class Jogo {
    public Jogo(Time a, Time b, int golsA, int golsB) {
        a.registrarResultado(golsA, golsB);
        b.registrarResultado(golsB, golsA);
    }
}