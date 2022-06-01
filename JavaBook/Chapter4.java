
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
		
		int [] seq = new int[10];
		//塩基配列をランダムに生成
		for(int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		//生成した塩基配列の記号を表示
		for(int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
			case 0:
				System.out.print("A ");
				break;
			case 1:
				System.out.print("T ");
				break;
			case 2:
				System.out.print("G ");
				break;
			case 3:
				System.out.print("C ");
				break;
			}
	}
}
