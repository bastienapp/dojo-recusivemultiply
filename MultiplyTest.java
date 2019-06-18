import junit.framework.*;
import org.junit.Test;
import java.util.Random;

public class MultiplyTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() {
		Multiply test = new Multiply();
		assertEquals(0, test.multiply(2, 0));
	}

	@Test
	public void test2() {
		Multiply test = new Multiply();
		assertEquals(2, test.multiply(2, 1));
	}

	@Test
	public void test3() {
		Multiply test = new Multiply();
		assertEquals(4, test.multiply(2, 2));
	}

	@Test
	public void test4() {
		Multiply test = new Multiply();
		assertEquals(42, test.multiply(6, 7));
	}

	@Test
	public void test5() {
		Multiply test = new Multiply();
		assertEquals(-42, test.multiply(-6, 7));
	}

	@Test
	public void test6() {
		Multiply test = new Multiply();
		assertEquals(-42, test.multiply(6, -7));
	}

	@Test
	public void test7() {
		Multiply test = new Multiply();
		assertEquals(42, test.multiply(-6, -7));
	}

	@Test
	public void testRandom() {
		Multiply test = new Multiply();
		Random r = new Random();
		int a = r.nextInt(21) - 10;
		int b = r.nextInt(21) - 10;
		assertEquals(a * b, test.multiply(a, b));
	}
}
