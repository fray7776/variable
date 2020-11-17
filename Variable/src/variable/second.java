package variable;

public class second {

	public static void main(String[] args) {
		int num1,num2,result;
	     String resultStr = "결과값은";
	     
	     num1= 10;
	     num2= 20;
	     if (num1 > num2) {
	    	 result = num1 - num2;
	     } else {
	    	 result = num2 - num1;
	     }
	     System.out.println(resultStr + result);
	}

}
