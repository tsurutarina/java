public class Exception01 {
  public static void main(String[] args) {
    System.out.println("100 ÷0 は？");
    // 0で割り算 例外発生、これ以降は処理が実行されない
    int result = 100 / 0;
    System.out.println("計算結果" + result);
    System.out.println("プログラム終了");
  }
}