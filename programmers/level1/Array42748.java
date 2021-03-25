package programmers.level1;

import java.util.Arrays;

public class Array42748 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		// arrCopy : array를 i번째부터 j번째까지 자른 배열 (배열의 길이: j-i+1 )

		int[] answer = new int[commands.length];

		for (int l = 0; l < answer.length; l++) {

			// ---------------------------------------------------


			int[] tempReturn = new int[commands[l][1] - commands[l][0] + 1];
			// 3 //3
			System.arraycopy(array, commands[l][0] - 1, tempReturn, 0, commands[l][1] - commands[l][0] + 1);
			// 1 4
			// 오름차순 정렬
			Arrays.sort(tempReturn);

			// ---------------------------------------------------
			answer[l] = tempReturn[commands[l][2] - 1];

		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

}
