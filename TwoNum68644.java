import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
       

		ArrayList<Integer> aryTemp = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (aryTemp.contains(numbers[i] + numbers[j])) {

				} else {
					aryTemp.add(numbers[i] + numbers[j]);
				}

			}
		}

		aryTemp.sort(Comparator.naturalOrder());

		return aryTemp.stream().sorted().mapToInt(Number::intValue).toArray();
        
    }
}
