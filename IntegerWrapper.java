public class IntegerWrapper{
	public static void main(String[] args) {
		int i = 25;

		Integer obj = new Integer(50); // Old way...
		Integer obj1 = Integer.valueOf(30);//New Way

		int ans = i + obj ; // AUTO Boxing
		int ans0 = i + obj1 ;
		System.out.println("Ans 1 :" +ans);
		System.out.println("Ans 2 :" +ans0);


		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);


		String s = "1000";
		int num = Integer.parseInt(s);
		System.out.println("Number is :" +num);
  		

  		System.out.println(Integer.toBinaryString(12));
  		System.out.println(Integer.toOctalString(45));
  		System.out.println(Integer.toHexString(71));
	}
}

