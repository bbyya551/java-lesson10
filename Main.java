public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.run();
    
    SuperHero sh = new SuperHero();
    sh.run();

    // Weapon w = new Weapon();

    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(h);
  }
}
