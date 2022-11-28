public class PoisonMatango extends Matango {
  int times = 5;

  public PoisonMatango(char suffix) {
    super(suffix);
  }

  public void attack(Hero h) {
    super.attack(h);
    if (this.times > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      h.hp -= (h.hp / 5);
      System.out.println(h.hp / 5 + "ポイントのダメージ");
      this.times -= 1;
    }
  }
}
