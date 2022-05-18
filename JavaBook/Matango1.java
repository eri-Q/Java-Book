
public class Matango1 {
	int hp = 50;
	char suffix;
	public Matango1(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ！");
		h.hp -= 10;
	}
}
