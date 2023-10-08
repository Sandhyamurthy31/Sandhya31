package week1.day1;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		String Sname=s.studentName;
		float  Rrollnumber=s.rollNo;
		String Cname = s.collegeName;
		float Mark = s.markScored;
		float cgpa = s.CGPA;
		System.out.println("student name: "+ Sname);
		System.out.println("student rollnumber: "+Rrollnumber);
		System.out.println("student Cname: "+Cname);
		System.out.println("student mark: "+ Mark);
		System.out.println("student Cgpa:"+cgpa);
		
		
				}

}
