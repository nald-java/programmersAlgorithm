import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        // answer의 길이는 commands의 길이와 같다

		for (int l = 0; l < answer.length; l++) {
        //전체 for문으로 감쌈

			int[] tempReturn = new int[commands[l][1] - commands[l][0] + 1];
			// 배열선언, 길이는 j-i+1
            
			System.arraycopy(array, commands[l][0] - 1, tempReturn, 0, commands[l][1] - commands[l][0] + 1);
            // 요구사항에 맞는 array의 배열의 값만 옮김
			
			Arrays.sort(tempReturn);
            // 오름차순 정렬

			answer[l] = tempReturn[commands[l][2] - 1];
            // k번째 숫자를 각 배열에 담기

		}

        return answer;
    }
}
