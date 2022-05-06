package JavaBook;

public class Chapter4_9 {
	public static void main(String[] args) {
		int[] moneyList = {191902, 8301, 5510};
		for (int i : moneyList) {
			System.out.println(i);
		}
		
		int[] numbers = new int[] {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (i == input) {
				System.out.println("アタリ！");			
			}
		}
		
	}
}
