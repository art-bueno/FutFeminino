import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CampeonatoServiceTest {

    @Test
    public void testPontuacaoAposVitoria() {
        CampeonatoService cs = new CampeonatoServiceImpl();

        cs.registrarTime("Time A", "Cidade A");
        cs.registrarTime("Time B", "Cidade B");

        cs.registrarJogo("Time A", "Time B", 2, 0);

        assertEquals(3, cs.getPontos("Time A"));
        assertEquals(0, cs.getPontos("Time B"));
    }

    @Test
    public void testPontuacaoAposEmpate() {
        CampeonatoService cs = new CampeonatoServiceImpl();

        cs.registrarTime("Time C", "Cidade C");
        cs.registrarTime("Time D", "Cidade D");

        cs.registrarJogo("Time C", "Time D", 1, 1);

        assertEquals(1, cs.getPontos("Time C"));
        assertEquals(1, cs.getPontos("Time D"));
    }
}