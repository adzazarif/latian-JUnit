import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test;
class CalculatorTest{
    private val calculator: Calculator = Calculator()

    @Test
    fun testTambah(){
        val excepted = 10;
        assertEquals(excepted, calculator.tambah(5,5))
    }

    @Test
    fun testKurang(){
        val excepted = 5;
        assertEquals(excepted, calculator.kurang(10,5))
    }

    @Test
    fun testKali(){
        val excepted = 10;
        assertEquals(excepted, calculator.kali(2,5))
    }

    @Test
    fun testBagi(){
        val excepted = 5;
        assertEquals(excepted, calculator.bagi(10,2))
    }
}