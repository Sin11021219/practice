package sample;

public class JB04_Expression {

	public static void main(String[] args) {
		
		// ***** 各種の演算子を使用したサンプル・プログラム *****
		
		// 算術演算子を使用した例
		int a = 10;
		int b = 20;
		
		System.out.println( "***** 算術演算子の動作 *****" );
		System.out.println( a + "と" + b + "の加算結果は【" + ( a+b )+ "】です" );
		System.out.println( a + "と" + b + "の減算結果は【" + ( a-b )+ "】です" );
		System.out.println( a + "と" + b + "の乗算結果は【" + ( a*b )+ "】です" );
		System.out.println( a + "と" + b + "の除算結果は【" + ( a/b )+ "】です" );
		System.out.println( a + "と" + b + "の剰余結果は【" + ( a%b )+ "】です" );
		System.out.println();
				
		a = 100;
		b = 200;
		
		/*
		 * 算術代入演算子を使用した例
		 * 
		 * 算術代入演算子
		 * +=、-=、*=、/=
		 * 算術代入演算子は、演算した結果の値を代入するというもの。
		 * +=演算子の場合、以下の動作と同じになる。
		 * a = a + 10;（変数aに10を加算した結果を変数aに代入する）
		 * 
		 * 以下のコードはどちらも同じ演算結果をなる。
		 * a = a + 10;
		 * a += 10;
		 */
		System.out.println( "***** 算術代入演算子の動作 *****" );
		System.out.println( a + "に" + b + "を加算した結果は【" + (a+=b) + "】です" );
		System.out.println( a + "を" + b + "で減算した結果は【" + (a-=b) + "】です" );
		System.out.println( a + "に" + b + "を乗算した結果は【" + (a*=b) + "】です" );
		System.out.println( a + "を" + b + "で除算した結果は【" + (a/=b) + "】です" );
		System.out.println();
		
		/*
		 * 連結演算子
		 * +
		 * 演算子の両辺の値を文字列として連結する。
		 * 
		 * 演算子の左辺、右辺のどちらか一方が文字列である場合、連結演算子として機能する。
		 * 演算子の両辺が数値である場合、加算演算子として機能する。※
		 * （※：同一式内に別の連結演算子があり、加算の優先順位が確保されていない場合は
		 * 　　　数値と数値の加算を行わない）
		 * 
		 */
		System.out.println( "***** 連結演算子および算術演算子（+）の動作 *****" );
		System.out.println( 10+10 );
		System.out.println( 10 + "あ" );
		System.out.println( "あ"+10 );
		System.out.println( "10+10の結果は==>" + (10+10) );
		/*
		 * 						①										20
		 * 						②	"10+10の結果は==>" + 20
		 * 						③ "10+10の結果は==>20"
		 */
		System.out.println( "10+10の結果は==>" + 10+10 );
		/*
		 * 						①"10+10の結果は==>" + 10
		 * 						②"10+10の結果は==>10"
		 * 						③"10+10の結果は==>10" + 10
		 * 						④"10+10の結果は==>1010"
		 */
		System.out.println( a + "と" + b + "の加算結果は" + ( a+b ) );
		/*
		 * 						①												300
		 * 						②100 + "と"
		 * 						③"100と" + 200
		 * 						④"100と200" + "の加算結果は"
		 * 						⑤"100と200の加算結果は" + 300
		 * 						⑥"100と200の加算結果は300"
		 * 
		 */
		System.out.println( a + "と" + b + "の加算結果は" +  a+b );
		/*
		 * 						①100 + "と"
		 * 						②"100と" + 200
		 * 						③"100と200" + "の加算結果は"
		 * 						④"100と200の加算結果は" + 100
		 * 						⑤"100と200の加算結果は100" + 200
		 * 						⑥"100と200の加算結果は100200"
		 */
		System.out.println();
		
		/*
		 * インクリメント演算子・デクリメント演算子を使用した例
		 * 
		 * インクリメント演算子
		 * ++（対象となる値に1を加算する）
		 * デクリメント演算子
		 * --（対象となる値から1を減算する）
		 * 
		 * インクリメント演算子、デクリメント演算子、共に使用方法が2種類あり
		 * その使用方法によって動作が異なる。
		 * 変数aに使用した場合
		 * ++a（前置きインクリメント演算子）⇒ 式評価の前に加算が行われる。
		 * a++（後置きインクリメント演算子）⇒ 式評価の後に加算が行われる。
		 * 
		 */
		System.out.println( "***** インクリメント/デクリメント演算子の動作 *****" );
		a = 10;
		b = 0;
		System.out.println( "a=>" + a + "：b=>" + b );
		b = ++a;
		/*
		 * ↑
		 * ① ++a ⇒ aは11
		 * ② b = a(中身は11)
		 * ③ bは11
		 * 
		 */
		System.out.println( "前置きインクリメントの場合 a=>" + a + "：b=>" + b );
		System.out.println();
		
		a = 10;
		b = 0;
		System.out.println( "a=>" + a + "：b=>" + b );
		b = a++;
		/*
		 * ① b = a ⇒ bは10、aは10
		 * ② a++ ⇒ aは11になる
		 */
		System.out.println( "後置きインクリメントの場合 a=>" + a + "：b=>" + b );
		System.out.println();
		
		// インクリメント演算子を使用した変数をprintln()メソッドで使用した場合
		a = 10;
		System.out.println( ++a );
		System.out.println( a );
		a = 10;
		System.out.println( a++ );
		System.out.println( a );
				
		
		
	}

}
