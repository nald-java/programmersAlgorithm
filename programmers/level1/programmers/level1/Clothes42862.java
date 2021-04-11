package programmers.level1;

public class Clothes42862 {

	 public int solution(int n, int[] lost, int[] reserve) {

	        int answer = 0;
			int[] status = new int[n]; // n순서대로 잃어버럼-1, 여벌+1의 합을 가진 배열


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

				// 3. 앞번호가 여유분이 있을경우 빌려주기
				if (i != 0 && status[i] == -1) {
					if (status[i - 1] == 1) {
						status[i] = 0;
						status[i - 1] = 0;
					}
				}
				// -------------------------------------------
				
				// 4. 뒷번호가 여유분이 있을경우 빌려주기
				if (i != n - 1 && status[i] == -1) {
					if (status[i + 1] == 1) {
						status[i] = 0;
						status[i + 1] = 0;
					}
				}
				// -------------------------------------------
			}
			// 5.  합계 구하기
				for (int i = 0; i < status.length; i++) {
				if (status[i] >= 0) {
					answer++;
				}
			}
			// -------------------------------------------

	        
	        return answer;

	}

}
