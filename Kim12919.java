package programmers.test;

public class Kim12919 {

	public static void main(String[] args) {

		  String answer = "";
	        
	        int where = 0;
	        String[] seoul = {"janem","Kim"};
	        
		        
	        for (int i = 0 ; i < seoul.length ; i++ ){
	            if(seoul[i].equals("Kim")){
	                where = i;
	                break;
	            }
	        }
	       System.out.println("김서방은 "+where+"에 있다"); 
		

	}

}
