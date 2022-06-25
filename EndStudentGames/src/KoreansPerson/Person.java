package KoreansPerson;

public class Person {
	String citizenNumber;
	String name;
	int birthYear;
	public Person() {}
	
	public Person(String citizenNumber,String name,int birthYear) {
		this.citizenNumber = citizenNumber;
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getcitizenNumber() {return citizenNumber;}
	public void setcitizenNumber(String citizenNumber) {this.citizenNumber = citizenNumber;}
	
	public String getname() {return name;}
	public void setname(String name) {this.name = name;}
	
	public int getbirthYear() {return birthYear;}
	public void setbirthYear(int birthYear) {this.birthYear = birthYear;}
	
	public String toString() { return "Person : [ citizenNumber = "+citizenNumber+", name = "+name+", birthYear = "+birthYear+"]\n";}
	
	public int comparTO(Person p) {return this.getcitizenNumber().compareTo(p.getcitizenNumber());}
}

class Student extends Person{
	String studentNumber;
	String dept;
	
	public Student(String citizenNumber,String name,int birthYear,String studentNumber,String dept) {
		super(citizenNumber,name,birthYear);
		this.studentNumber = studentNumber;
		this.dept = dept;
	}
	public Student() {}
	public String getstudentNumber() {return studentNumber;}
	public void setstudentNumber(String studentNumber) {this.studentNumber = studentNumber;}
	
	public String getdept() {return dept;}
	public void setdept(String dept) {this.dept = dept;}
	
	public String toString() {return "Person : [ citizenNumber = "+citizenNumber+", name = "+name+", birthYear = "+birthYear+", studentNumber = "+studentNumber+", dept = "+dept+"]\n";}
}

class Researcher extends Person{
	String employeeNumber;
	String dept;
	public Researcher() {}
	public Researcher(String citizenNumber,String name,int birthYear,String employeeNumber,String dept) {
		super(citizenNumber,name,birthYear);
		this.employeeNumber = employeeNumber;
		this.dept = dept;
	}
	
	public String getemployeeNumber() {return employeeNumber;}
	public void setemployeeNumber(String employeeNumber) {this.employeeNumber = employeeNumber;}
	
	public String getdept() {return dept;}
	public void setdept(String dept) {this.dept = dept;}
	
	public String toString() {return "Person : [ citizenNumber = "+citizenNumber+", name = "+name+", birthYear = "+birthYear+", employeeNumber = "+employeeNumber+", dept = "+dept+"]\n";}
}
