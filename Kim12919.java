package programmers.test;

class Solution {
    public String solution(String[] seoul) {
		  String answer = "";
	        
	        int where = 0;
      		        
	        for (int i = 0 ; i < seoul.length ; i++ ){
	            if(seoul[i].equals("Kim")){
	                where = i;
	            }
	        }
        return "김서방은 "+where+"에 있다";
    }
}
