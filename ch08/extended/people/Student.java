package ch08.extended.people;

public class Student extends People {
	// 필드
	public int studentNo ;
	
	// 생성자
	public Student(String name, String ssn, int studentNo) {
		//this.name = name;
		//this.ssn = ssn;        --> 부모클래스에서 선언되어서 사용 못함.
		super(name,ssn);  		 	
		this.studentNo = studentNo;
	} // 커스텀 생성자 Student student = new Student("김기원", "주민번호", 2406);
	
	// 메서드
	
	
}
