//https://programmers.co.kr/learn/courses/30/lessons/42862#

package programmers.test;

public class Clothes42862 {

	public static void main(String arg[]) {

		int n = 3;
		int[] lost = { 1, 2, 3 };
		int[] reserve = { 2 };

		int[] status = new int[n];

		// 1. status배열에 옷이 1개만 있는것을 0이라고 가정
		// 2. status배열에 분실한경우 -1, 여벌이있는경우 +1
		// 3. lost배열의 맨 앞에서 부터 -1인 사람들에 한하여 순서대로 1이상인 사람들에게 옷을 빌려 받음
		// 4. 빌려준 후에는 해당 reserve는 -1처리
		// 4. answer은 양수인 수의 합계

		for (int i : status) {
			status[i] = 0;
		}

		for (int i = 0; i < lost.length; i++) {
			status[lost[i] - 1] -= 1;
		}

		for (int i = 0; i < reserve.length; i++) {
			status[reserve[i] - 1] += 1;
		}

		for (int i = 0; i < status.length - 1; i++) {

			if ((status[i] == -1) && (status[i + 1] == 1)) {
				status[i] = 0;
				status[i + 1] = 0;
			}

			if (i == 0) {
			} else {
				if ((status[i] == -1) && (status[i - 1] == 1)) {
					status[i] = 0;
					status[i - 1] = 0;
				}
			}

		}

		int answer = 0;
		for (int i = 0; i < status.length; i++) {
			if (status[i] >= 0) {
				answer++;
			}
		}

		System.out.println("정답 :" + answer);

	}

}
