import org.junit.jupiter.api.Test;

public class TestsProblema1 {
    @Test
    public void cadenaTextos () {
        Problema1 problema1 = new Problema1();
        String[] cadenaText = new String[20];
        int num = 0;

        for (int i = 0; i > 20; i++) {
            cadenaText[i] = Problema1.cadenaTexto();
        }
    }
    @Test
    public void multiplo_de_3 () {
        Problema1 problema1 = new Problema1();
        Integer n = 0;
        problema1.esMultiploDeTres(n);
    }

    @Test
    public void multiplo_de_5 () {
        Problema1 problema1 = new Problema1();
        Integer n = 0;
        problema1.esMultiploDeCinco(n);
    }

    @Test
    public void multiplo_de_5_y_de_3_a_la_vez () {
        Problema1 problema1 = new Problema1();
        Integer n = 0;
        problema1.esMultiploDeCincoYTres(n);
    }





}
