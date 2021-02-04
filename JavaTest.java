import org.junit.Test;

public class JavaTest {
    Calculadora calcular = new Calculadora();

    @Test
    public void TestCalc1(){
        String resultado = calcular.Calculo("4 8 3 * +");
        System.out.println(resultado);

    }

    @Test
    public void TestCalc2(){
        String resultado = calcular.Calculo("5 1 + 2 - 2 /");
        System.out.println(resultado);

    }
    
    @Test
    public void TestCalc3(){
        String resultado = calcular.Calculo("4 8 3 * + 2 -");
        System.out.println(resultado);

    }
}
