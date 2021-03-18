package programmers.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoNum68644 {

    public int[] solution(int[] numbers) {
        
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


		System.out.println(aryTemp);
		 
//		 return answer;
        
    }

}
