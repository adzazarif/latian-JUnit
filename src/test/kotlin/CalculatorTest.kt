import org.junit.jupiter.api.Assertions.* //import fungsi assertEquals
import kotlin.test.Test;//import function tes
class CalculatorTest{//decalration class CalcutatorTest
    private val calculator: Calculator = Calculator()//testSample variable declaration and initialized with the no-argument constructor of the Sample class

    @Test
    fun testTambah(){//declaration fungsi testTambah
        val excepted = 10;//declaration variable excepted with value 10
        assertEquals(excepted, calculator.tambah(5,5))// The test uses the assertEquals function which compares the expected variable value with the result of calling calculator.sum(5,5).
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