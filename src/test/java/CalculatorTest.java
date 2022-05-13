import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void deveriaCalcularAreaQuadrado() {
        Calculator calculator = new Calculator();
        int area = calculator.areaQuadrado(2);
        assertEquals(4,area);

    }
}