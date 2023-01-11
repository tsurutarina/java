public class Switch01 {
  public static void main(String[] args) {
    int val = 2;
    switch (val) {
      case 3:
        System.out.println("よくできました！");
        break;
      case 2:
        System.out.println("ふつうでした！");
        break;
      // caseに一致しない場合に実行
      default:
        System.out.println("がんばろう！");
    }
  }
}