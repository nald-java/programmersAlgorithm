package programmers.test;

public class Phone12948 {

	public static void main(String[] args) {

		String phone_number = "027778888";
		String answer = "";
		String encode ="";

		String LastNum = phone_number.substring(phone_number.length() - 4);

		for (int i = 0; i < phone_number.length() - 4; i++) {

			encode = encode + "*";
		}

		System.out.println(encode + LastNum);

	}

}
