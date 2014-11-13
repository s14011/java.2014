import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex4Test {

	@Test
	public void ex4_1_1(){
		Ex4 ex4 = new Ex4();
		int[] expected = {-3, -2, -1, 0, 1, 2, 3};
		int[] test = {3, 2, 1, 0, -1, -2, -3};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_2(){
		Ex4 ex4 = new Ex4();
		int[] expected = {-6, -5, -4, -3, -2, -1, 0};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_3(){
		Ex4 ex4 = new Ex4();
		int[] expected = {0, 1, 2, 3, 4, 5, 6};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_4(){
		Ex4 ex4 = new Ex4();
		int[] expected = {-6, -6, -3, -3, -1, -1, 0};
		int[] test = {0, -3, -1, -6, -3, -1, -6};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_5(){
		Ex4 ex4 = new Ex4();
		int[] expected = {0, 2, 2, 4, 4, 5, 5};
		int[] test = {0, 4, 2, 5, 5, 2, 4};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex4Test.class.getName());
	}
}
