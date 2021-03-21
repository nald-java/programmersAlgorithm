package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Function42586 {

	public static void main(String[] args) {
//		int[] progresses = { 95, 90, 99, 99, 80, 90 };
//		int[] speeds = { 1, 1, 1, 1, 1 ,1};

		int[] progresses = { 100, 30, 55 };
		int[] speeds = { 1, 30, 5 };

		ArrayList<Integer> tempAnswers = new ArrayList<>();
		int[] answer = new int[tempAnswers.size()]; // 정답

		int startNum = 0; // 마지막으로 배포한 배열위치, while 반복시 시작할 배열위치
		int lastNum = 0; // startNum부터 배열이 연속적으로 100이 된 마지막 배열위치

		while (aryNum(progresses)) { // while(100이 넘지 않는 배열이 1개라도 있을 경우 true){

			// ------------- for 각 배열마다 하루가 추가 됨---------------------------------
			for (int i = startNum; i < progresses.length; i++) {
				progresses[i] = +progresses[i] + speeds[i];
			}
			// ------------- for 각 배열마다 하루가 추가 됨 끝 ---------------------------------

			if (aryNum(progresses) == false) { // 배열 모두가 100이 되었다면 lastNum은 배열의 길이
				lastNum = progresses.length;
			}

			if (progresses[startNum] >= 100) { // ------------- 만약 progressess[확인할 배열차례] 값이 100이 넘는다면
				// for 확인할 배열 차례부터 배열차례들이 100을 가졌는지 확인하고 가장 마지막 차례 확인
				// 마지막 배열차례값 을 확인할 배열 차례값에 넣음 startNum = i

				for (int j = startNum; j < progresses.length; j++) { // 연속적으로 100이 넘는 마지막 값을 찾아보자

					if (progresses[j] < 100) { // j가 마지막 값
						lastNum = j;
						break;
						
					}

				}

				System.out.println(startNum);
				System.out.println(lastNum);
				tempAnswers.add(lastNum - startNum); // 배포될 갯수를 ArrayList에 담음
				startNum = lastNum; // 배포의 마지막 숫자는 다음 while문의 시작 숫자
			}
		}

		answer = tempAnswers.stream().mapToInt(Number::intValue).toArray(); // ArrayList to Array

		System.out.println(Arrays.toString(answer));

	}

	public static boolean aryNum(int[] progesses) { // while문의 반복 조건

		for (int i = 0; i < progesses.length; i++) { // 1개라도 100이 안되는 경우는 true반환
			if (progesses[i] < 100) {
				return true;

			}

		}
		return false; // 전부 100이면 false로 while 반복문 멈춤
	}

}