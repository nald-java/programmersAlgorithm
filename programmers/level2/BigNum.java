package programmers.level2;

import java.util.ArrayList;

public class BigNum {

	public static void main(String[] args) {

//		String number = "0505050";
//		               //0123456789
//		int k = 4;
//		
		String number = "7987654321";
		int k = 4;
		ArrayList <Integer> listStartBig = new ArrayList<>(); // return값의 시작위치부터 끝까지 담음

		/*
		 * number : 주어진 숫자 
		 * k : 제거할 수 숫자
		 * 형변환을 하고 할지 파싱을 시킬지.......
		 * 
		 * 1) number를 charArray에 담음 
		 * 2) char중 가장 큰 수의 위치를 찾되 뒤에서부터 제거할만큼의 숫자는 제외 > 그 뒤에 숫자가 모자랄 수 있으니까 
		 * 3) ArrayList 에 옮기고 2에서 찾은 가장 큰 수보다 앞에 위치하는 수들은 삭제
		 * 4) number-k의 숫자에 맞춰 list 앞부터 뒤의 숫자와 비교하여 낮은 숫자를 제거
		 * 5) 남은 숫자가 다 같거나 순서가 내림차순인 경우에는 끝의 값들을 제거
		 * 6) Integer를 String으로 변환 후 리턴
		 * 
		 * 
		 * 결과 : 시간초과.............
		 */

		char[] numberToChar = number.toCharArray();
		//1) number를 charArray에 담음
		
		int biggestCharLocated = 0; // 가장 큰 숫자

		for (int i = 0; i < numberToChar.length-(numberToChar.length-k); i++) { 
		//2) char중 가장 큰 수의 위치를 찾되 뒤에서부터 제거할만큼의 숫자는 제외 > 그 뒤에 숫자가 모자랄 수 있으니까 

                if(numberToChar[i]=='9'){        // 9가 있으면 그냥 시간낭비하지말고 break갑시다
                	break;
                }
				if (numberToChar[biggestCharLocated] < numberToChar[i]) {
				
					biggestCharLocated = i;
				}
		}
					
		System.out.println("가장 큰 수는 배열의 "+biggestCharLocated+"번쨰에 있다");

		for (int i = biggestCharLocated; i < numberToChar.length; i++) {  
		//3) ArrayList 에 옮기고 2에서 찾은 가장 큰 수보다 앞에 위치하는 수들은 삭제

			listStartBig.add(Integer.parseInt(String.valueOf(numberToChar[i])));
		}

		System.out.println("listStartBig "+listStartBig+ " 값에서 추가적으로 k1만큼 더 뺴야함");
		
		int k1 = k - (number.length() - listStartBig.size()); 
		// k1은 k에서 ArrayList에 담을 때 삭제한값(가장 큰 수 앞에 수들)을 뺀값
		
		System.out.println("그 k1의 값은 "+k1);

		int i = 1; // ArrayList에서 필요없는 값을 제거하기 위한 while 반복문에 쓰일 i

		while (k1 > 0) { // k1은 더 삭제해야 하는 갯수

			try {
				if (listStartBig.get(i - 1) < listStartBig.get(i)) {
					// 4) number-k의 숫자에 맞춰 list 앞부터 뒤의 숫자와 비교하여 앞이 작으면 숫자를 제거
					listStartBig.remove(i - 1);
					k1--;   // 삭제했으니까 남은 삭제해야 하는 갯수 -1
					i = 1;  // 제거가 완료되었으면 앞뒤가 달라지기 떄문에 i다시 초기화해서 처음부터 비교
					System.out.println("그래서 뻈다");
				} else { // 둘 다 해당되지 않는 경우 다음 i확인
					i++;
				}
			} catch (RuntimeException e) {
				if (i == listStartBig.size()) {
					// 5) 남은 숫자가 다 같거나 순서가 내림차순인 경우에는 끝의 값들을 제거
					for (int j = listStartBig.size() - 1; 0 < k1; j--) {
						listStartBig.remove(j);
						k1--;
					}
					System.out.println("그런데 이제는 순서가 같은값 또는 내림차순이라 그냥 뒤에서 부터 뺸다");
					break;
				}
			}
		}

		String answer = "";

		for (int j = 0; j < listStartBig.size(); j++) { 
			// 6) Integer를 String으로 변환 후 리턴
			answer = answer + String.valueOf(listStartBig.get(j));

		}

		if (number.length() == 1) { // 근데 처음부터 주어진게 1자리 였으면 그냥 number가 답
			answer = number;
		}

		System.out.println("정답은 " +answer);

	}
}