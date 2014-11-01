import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex3Test {

	@Test
	public void ex3_0_正の場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は正です";
		String actual = ex3.ex3_0(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_0_正でない場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は０か負です";
		String actual = ex3.ex3_0(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_1_正の場合の確認(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_1(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_1_正でない場合の確認(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_1(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_1_０の場合の確認(){
		Ex3 ex3 = new Ex3();
		int expected = 0;
		int actual = ex3.ex3_1(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_2_約数の場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "4は12の約数です";
		String actual = ex3.ex3_2(12, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_2_約数でない場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "5は12の約数ではありません";
		String actual = ex3.ex3_2(12, 5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_3_ａが大きい場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "8の方が大きいです";
		String actual = ex3.ex3_3(8, -9);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_3_ｂが大きい場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "9の方が大きいです";
		String actual = ex3.ex3_3(-11, 9);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_3_ａとｂが同じ値の場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "同じ値です";
		String actual = ex3.ex3_3(3, 3);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_4_５で割り切れる場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は5で割り切れます";
		String actual = ex3.ex3_4(15);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_4_５で割り切れない場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は5で割り切れません";
		String actual = ex3.ex3_4(11);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_4_正でない場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "正でない整数値です";
		String actual = ex3.ex3_4(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_5_１０の倍数の場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は5で割り切れます";
		String actual = ex3.ex3_5(1000);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_5_１０の倍数でない場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は5で割り切れません";
		String actual = ex3.ex3_5(1001);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_5_正でない場合の確認(){
		Ex3 ex3 = new Ex3();
		String expected = "正でない整数値です";
		String actual = ex3.ex3_5(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_３で割り切れる(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は3で割り切れます";
		String actual = ex3.ex3_5(3);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_３で割ると余り１(){
		Ex3 ex3 = new Ex3();
		String expected = "その値を3で割った余りは1です";
		String actual = ex3.ex3_5(4);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_３で割ると余り２(){
		Ex3 ex3 = new Ex3();
		String expected = "その値を3で割った余りは2です";
		String actual = ex3.ex3_5(5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_正でない(){
		Ex3 ex3 = new Ex3();
		String expected = "正でない整数値です";
		String actual = ex3.ex3_5(-1);
		assertThat(actual, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex3Test.class.getName());
	}
}
