
public class Chapter4 {
	public static void main(String[] args) {
		// ループによる全要素の利用
		int [] scores1 = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores1.length; i++) {
			System.out.println(scores1[i]);
		}
		
		// ループによる集計
		int [] scores2 = {20, 30, 40, 50, 80};
		int sum = 0;
		int count = 0;
		for (int i =0; i < scores2.length;  i++) {
			sum += scores2[i];
			if (scores2[i] >= 50) {
				count++;
			}
		}
		int avg = sum / scores2.length;
		System.out.println("合計点: " + sum);
		System.out.println("平均点: " + avg);
		System.out.println("50点以上の科目の数は: " + count);
	}
}
