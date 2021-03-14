//https://programmers.co.kr/learn/courses/30/lessons/42862#

package programmers.test;

public class Clothes42862_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 3, 5 };
		int[] status = new int[n]; // n순서대로 잃어버럼-1, 여벌+1의 합을 가진 배열
		
		
		// 1. status배열에 옷이 1개만 있는것을 0이라고 가정
		// 2. status배열에 분실한경우 -1, 여벌이있는경우 +1, lostOrder배열에 분실한경우 -1
		// 3. 잃어버린놈 앞번호가 여유분이 있을경우 빌려주기. 단, 잃어버린놈이 맨 첫번째 순서이거나 여유분이 있으면 생략
		// 4. 잃어버린놈 뒷번호가 여유분이 있을경우 빌려주기. 단, 잃어버린놈이 맨 마지막 순서이거나 여유분이 있으면 생략
		// 5. answer 안잃어버린애 또는 빌려서 해결한애 합계 구하기
		
		

		// 1. status배열에 옷이 1개만 있는것을 0이라고 가정
		for (int i : status) {
			status[i] = 0;
		}
		// -------------------------------------------

		// 2. status배열에 분실한경우 -1, 여벌이있는경우 +1
		for (int i = 0; i < lost.length; i++) {
			status[lost[i] - 1] -= 1;
		
		}

		for (int i = 0; i < reserve.length; i++) {
			status[reserve[i] - 1] += 1;
		}
		// -------------------------------------------

		for (int i = 0; i < status.length; i++) {

			// 3. 잃어버린놈 앞번호가 여유분이 있을경우 빌려주기
			// 단, 잃어버린놈이 맨 첫번째 순서이거나 여유분이 있으면 생략

			if (i != 0 && status[i] == -1) {
				if (status[i - 1] == 1) {
					status[i] = 0;
					status[i - 1] = 0;
				}
			}
			// -------------------------------------------
			
			// 4. 잃어버린놈 뒷번호가 여유분이 있을경우 빌려주기
			// 단, 잃어버린놈이 맨 마지막 순서이거나 여유분이 있으면 생략

			if (i != n - 1 && status[i] == -1) {
				if (status[i + 1] == 1) {
					status[i] = 0;
					status[i + 1] = 0;
				}
			}
			// -------------------------------------------
		}
		//5. 안잃어버린애 또는 빌려서 해결한애 합계 구하기
		int answer = 0;
		for (int i = 0; i < status.length; i++) {
			if (status[i] >= 0) {
				answer++;
			}
		}
		// -------------------------------------------


		System.out.println("정답 :" + answer);

	}

}

