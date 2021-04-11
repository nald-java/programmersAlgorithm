package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoNum68644 {

	public static void main(String[] args) {

        
    	int[] numbers = {1,2,3,4};
        ArrayList<Integer> aryTemp = new ArrayList<>();
        int[] answer = {};

		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (aryTemp.contains(numbers[i] + numbers[j])) {

				} else {
					aryTemp.add(numbers[i] + numbers[j]);
				}

			}
		}

		aryTemp.sort(Comparator.naturalOrder());


		aryTemp.sort(Comparator.naturalOrder());

		answer = aryTemp.stream().sorted().mapToInt(Number::intValue).toArray();

		System.out.println(answer);
		 
//		 return answer;
        
    }

}
