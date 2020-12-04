
//201204
//14장 연습문제 5

package Practice;

import java.util.function.IntBinaryOperator;

public class LambdaExample {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {

		// Max Value
		int max = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "right: " + right);
				if (left > right)
					return left;
				else
					return right;
			}
		});

		System.out.println("Max Value: " + max);

		// Min Value
		int min = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "right: " + right);
				if (left < right)
					return left;
				else
					return right;
			}
		});
		System.out.println("Min Value: " + min);
	}
}
