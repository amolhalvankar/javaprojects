// Type of Variables and Functions

class Student {

	static int rollNo;
	static String sName;

	static String collegeName;
	static int collegeId;

	public static void main(String[] args) {

		Student.collegeName = "DY Patil University";
		Student.collegeId = 1234;

		Student obj = new Student();
		obj.rollNo = 8;
		obj.sName = "Amol";

		System.out.println(sName);
		System.out.println(rollNo);

		System.out.println(collegeName);

		System.out.println(collegeId);

	}
}