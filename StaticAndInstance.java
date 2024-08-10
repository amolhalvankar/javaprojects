// Example of static and Instance function 
class A{
	public static void main(String[] args) {
		System.out.println("Hello");
		// Calling static function
			B.f1();

		// Calling instance function

		C obj = new C();
		obj.f2();
	}

}

class B{
	static void f1(){
		System.out.println("Good Morning..");
	}
	
}

class C{
	void f2(){
		System.out.println("Have a nice day!!!");
	}
	
}




