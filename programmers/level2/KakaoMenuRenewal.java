package programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KakaoMenuRenewal {

	public static void main(String[] args) {
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = { 2, 3, 4 };
		String[] answer = {};

		int a = orders.length;

		System.out.println(orders[0].length());

		for (int cousrseNum = 0; cousrseNum < course.length; cousrseNum++) {

			
			// 배열의 크기만큼 돌린다
			for (int ordersNum = 0; ordersNum < orders.length; ordersNum++) {
				// 알파벳을 하나씩 분리하기위한 char 배열 선언  
				char[] alphabet = new char[orders[ordersNum].length()];
				//char에 알파벳 배열위치값을 넣고 한글자씩 분리하자
				alphabet = orders[ordersNum].toCharArray();  //alphabet = {'c','b','a'...}
				//오름차순 정렬하자   //alphabet = {'a','b','c'...}
				Arrays.sort(alphabet);
				
				for (int i = 0; i < alphabet.length; i++) {
					//course값  course[courseNum]갯수로 합쳐보자
					
					for (int j = 0; j < alphabet.length; j++) {
						alphabet[i] + alphabet[j];
					}
					
									}


				}
			}

		}

}
