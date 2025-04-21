import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CampeonatoServiceImpl implements CampeonatoService {
    private Map<String, Time> times;

    public CampeonatoServiceImpl() {
        this.times = new HashMap<>();
    }

    public void registrarTime(String nome, String cidade) {
        if (!times.containsKey(nome)) {
            times.put(nome, new Time(nome, cidade));
        }
    }

    public void adicionarJogadora(String nomeTime, String nome, int idade, String posicao, int numero) {
        Time time = times.get(nomeTime);
        if (time != null) {
            time.adicionarJogadora(new Jogadora(nome, idade, posicao, numero));
        }
    }

    public void registrarJogo(String nomeA, String nomeB, int golsA, int golsB) {
        Time a = times.get(nomeA);
        Time b = times.get(nomeB);
        if (a != null && b != null) {
            new Jogo(a, b, golsA, golsB);
        }
    }

    public void exibirClassificacao() {
        List<Time> classificacao = times.values().stream()
                .sorted((a, b) -> Integer.compare(b.getPontos(), a.getPontos()))
                .collect(Collectors.toList());

        for (Time time : classificacao) {
            System.out.println(time.getNome() + " - " + time.getPontos() + " pts");
        }
    }

    public int getPontos(String nomeTime) {
        Time time = times.get(nomeTime);
        return (time != null) ? time.getPontos() : 0;
    }
}