public class forSentence {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 3; j >= 1; j--) {
				if(i != j) {
					System.out.println(i + "と" + j);
				}
			}
		}
	}
}
