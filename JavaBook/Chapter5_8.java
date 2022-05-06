package JavaBook;

public class Chapter5_8 {
	public static void introduceOneself() {
		String name = "John";
		int age = 26;
		double height = 183;
		char zodiac = '亥';
		System.out.println("My name is" + " " + name + ".");
		System.out.println("I am" + " " + age + "years old.");
		System.out.println("My height is" + " " + height);
		System.out.println("My chinese zodiac is" + " " + zodiac);
		
	}
	public static void main(String[] args) {
		introduceOneself();
		email("お誘い", "a@email.com", "5月６日のパーティーにきませんか？");
		email("a@email.com", "さっきのお誘いは嘘です。");
		
		double triangleArea = calcTriangleArea(10.0, 5.0);
		double circleArea = calcCircleArea(5.0);
		System.out.println("三角形の面積は　" + triangleArea + " 平方cm");
		System.out.println("縁の面積は　" + circleArea + "平方cm");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + " に、以下のメールを送信しました。");
		System.out.println("件名: " + title);
		System.out.println("本文: " + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + " に、以下のメールを送信しました。");
		System.out.println("件名: 無題");
		System.out.println("本文: " + text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
