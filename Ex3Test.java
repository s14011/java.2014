import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex3Test {

	@Test
	public void ex3_0_正の整数(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は正です";
		String actual = ex3.ex3_0(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_0_正でない整数(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は０か負です";
		String actual = ex3.ex3_0(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_1_正の整数(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_1(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_1_正でない整数(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_1(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_1_０の場合(){
		Ex3 ex3 = new Ex3();
		int expected = 0;
		int actual = ex3.ex3_1(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_2_約数(){
		Ex3 ex3 = new Ex3();
		String expected = "4は12の約数です";
		String actual = ex3.ex3_2(12, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_2_約数でない(){
		Ex3 ex3 = new Ex3();
		String expected = "5は12の約数ではありません";
		String actual = ex3.ex3_2(12, 5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_3_ａが大きい(){
		Ex3 ex3 = new Ex3();
		String expected = "8の方が大きいです";
		String actual = ex3.ex3_3(8, -9);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_3_ｂが大きい(){
		Ex3 ex3 = new Ex3();
		String expected = "9の方が大きいです";
		String actual = ex3.ex3_3(-11, 9);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_3_ａとｂが同じ値(){
		Ex3 ex3 = new Ex3();
		String expected = "同じ値です";
		String actual = ex3.ex3_3(3, 3);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_4_５で割り切れる(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は5で割り切れます";
		String actual = ex3.ex3_4(15);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_4_５で割り切れない(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は5で割り切れません";
		String actual = ex3.ex3_4(11);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_4_正でない(){
		Ex3 ex3 = new Ex3();
		String expected = "正でない整数値です";
		String actual = ex3.ex3_4(-5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_5_１０の倍数(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は10の倍数です";
		String actual = ex3.ex3_5(1000);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_5_１０の倍数でない(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は10の倍数ではありません";
		String actual = ex3.ex3_5(1001);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_5_正でない(){
		Ex3 ex3 = new Ex3();
		String expected = "正でない整数値です";
		String actual = ex3.ex3_5(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_３で割り切れる(){
		Ex3 ex3 = new Ex3();
		String expected = "その値は3で割り切れます";
		String actual = ex3.ex3_6(3);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_３で割ると余り１(){
		Ex3 ex3 = new Ex3();
		String expected = "その値を3で割った余りは1です";
		String actual = ex3.ex3_6(4);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_３で割ると余り２(){
		Ex3 ex3 = new Ex3();
		String expected = "その値を3で割った余りは2です";
		String actual = ex3.ex3_6(5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_6_正でない(){
		Ex3 ex3 = new Ex3();
		String expected = "正でない整数値です";
		String actual = ex3.ex3_6(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_０から５９の範囲で０(){
		Ex3 ex3 = new Ex3();
		String expected = "不可";
		String actual = ex3.ex3_7(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_０から５９の範囲で５９(){
		Ex3 ex3 = new Ex3();
		String expected = "不可";
		String actual = ex3.ex3_7(59);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_６０から６９の範囲で６０(){
		Ex3 ex3 = new Ex3();
		String expected = "可";
		String actual = ex3.ex3_7(60);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_６０から６９の範囲で６９(){
		Ex3 ex3 = new Ex3();
		String expected = "可";
		String actual = ex3.ex3_7(69);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_７０から７９の範囲で７０(){
		Ex3 ex3 = new Ex3();
		String expected = "良";
		String actual = ex3.ex3_7(70);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_７０から７９の範囲で７９(){
		Ex3 ex3 = new Ex3();
		String expected = "良";
		String actual = ex3.ex3_7(79);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_８０から１００の範囲で７９(){
		Ex3 ex3 = new Ex3();
		String expected = "優";
		String actual = ex3.ex3_7(80);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_８０から１００の範囲で１００(){
		Ex3 ex3 = new Ex3();
		String expected = "優";
		String actual = ex3.ex3_7(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_範囲外でマイナス１(){
		Ex3 ex3 = new Ex3();
		String expected = "範囲(0～100)外の値です";
		String actual = ex3.ex3_7(-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_7_範囲外で１０１(){
		Ex3 ex3 = new Ex3();
		String expected = "範囲(0～100)外の値です";
		String actual = ex3.ex3_7(101);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_8_1(){
		Ex3 ex3 = new Ex3();
		double expected = 0.5;
		double actual = ex3.ex3_8(-0.5,0.5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_8_2(){
		Ex3 ex3 = new Ex3();
		double expected = 0;
		double actual = ex3.ex3_8(-0.1,0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_8_3(){
		Ex3 ex3 = new Ex3();
		double expected = -0.1;
		double actual = ex3.ex3_8(-0.1,-0.2);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_8_4(){
		Ex3 ex3 = new Ex3();
		double expected = 1.2;
		double actual = ex3.ex3_8(1.1,1.2);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_8_5(){
		Ex3 ex3 = new Ex3();
		double expected = 0;
		double actual = ex3.ex3_8(0.0,0.0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_9_1(){
		Ex3 ex3 = new Ex3();
		int expected = 5;
		int actual = ex3.ex3_9(3,-2);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_9_2(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_9(-2,-3);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_9_3(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_9(3,2);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_9_4(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_9(0,-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_9_5(){
		Ex3 ex3 = new Ex3();
		int expected = 1;
		int actual = ex3.ex3_9(1,0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_10_1(){
		Ex3 ex3 = new Ex3();
		String expected = "それらの差は10以下です";
		String actual = ex3.ex3_10(-1,9);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_10_2(){
		Ex3 ex3 = new Ex3();
		String expected = "それらの差は11以上です";
		String actual = ex3.ex3_10(10,-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_10_3(){
		Ex3 ex3 = new Ex3();
		String expected = "それらの差は10以下です";
		String actual = ex3.ex3_10(10,0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_10_4(){
		Ex3 ex3 = new Ex3();
		String expected = "それらの差は11以上です";
		String actual = ex3.ex3_10(0,-11);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex3_10_5(){
		Ex3 ex3 = new Ex3();
		String expected = "それらの差は10以下です";
		String actual = ex3.ex3_10(-1,-11);
		assertThat(actual, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex3Test.class.getName());
	}
}
