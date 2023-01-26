public class FlyingPhone implements Phone, Flying {
  private int time;

  public FlyingPhone(int time) {
    this.time = time;
  }

  public void fly() {
    System.out.println(time + "分間、飛びます。");
  }

  public void call(String number) {
    System.out.println(number + "に電話します。電話で切るのは飛んでいる間だけです。");
  }

  public void powerOff() {
    Flying.super.powerOff();
  }
}