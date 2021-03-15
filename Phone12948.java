//https://programmers.co.kr/learn/courses/30/lessons/12948?language=java


class Solution {
    public String solution(String phone_number) {
        String answer = "";
        

		String encode ="";
		String LastNum = phone_number.substring(phone_number.length() - 4);

		for (int i = 0; i < phone_number.length() - 4; i++) {

			encode = encode + "*";
		}

        
        return encode + LastNum;
    }
}
