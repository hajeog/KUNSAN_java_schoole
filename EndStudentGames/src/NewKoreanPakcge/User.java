package NewKoreanPakcge;

public class User {
	int PN;
	String Name;
	int age;
	String Adress;
	String PonNum;
	
	public User() {}
	public User(int PN,String Name,int age,String Adress,String PonNum) {
		this.PN = PN;
		this.Name = Name;
		this.age = age;
		this.Adress = Adress;
		this.PonNum = PonNum;
	}
	
	public int getPN() {return PN;}
	public void setPN(int PN) {this.PN = PN;}
	
	public String getName() {return Name;}
	public void setName(String Name) {this.Name = Name;}
	
	public int getage() {return age;}
	public void setage(int age) {this.age = age;}
	
	public String getAdress() {return Adress;}
	public void setAdress(String Adress) {this.Adress = Adress;}
	
	public String getPonNum() {return PonNum;}
	public void setPonNum(String PonNum) {this.PonNum = PonNum;}
	
	public String toString() {return "일반 유저, 고유넘버 = "+PN+", 이름 = "+Name+", 나이 ="+age+", 주소 ="+Adress+", 휴대폰 번호 ="+PonNum+"]\n";} 
}

class Student extends User{
	String SchoolName;
	String Schoolnum;
	public Student() {}
	public Student(int PN,String Name,int age,String Adress,String PonNum,String SchoolName,String Schoolnum) {
		super(PN,Name,age,Adress,PonNum);
		this.SchoolName = SchoolName;
		this.Schoolnum = Schoolnum;
	}
	
	public String getSchoolName() {return SchoolName;}
	public void setSchoolName(String SchoolName) {this.SchoolName = SchoolName;}
	
	public String getSchoolnum() {return Schoolnum;}
	public void setSchoolnum(String Schoolnum) {this.Schoolnum = Schoolnum;}
	
	public String toString() {return "학생 유저, 고유넘버 = "+PN+", 이름 = "+Name+", 나이 ="+age+", 주소 ="+Adress+", 휴대폰 번호 ="+PonNum+", 학교 이름 ="+SchoolName+", 학번 ="+Schoolnum+"]\n";} 
}

class Researcher extends User{
	String ScohoolName;
	String Resuching;
	
	public Researcher() {}
	public Researcher(int PN,String Name,int age,String Adress,String PonNum,String ScohoolName,String Resuching) {
		super(PN,Name,age,Adress,PonNum);
		this.ScohoolName = ScohoolName;
		this.Resuching = Resuching;
	}
	
	public String getScohoolName() {return ScohoolName;}
	public void setScohoolName(String ScohoolName) {this.ScohoolName = ScohoolName;}
	
	public String getResuching() {return Resuching;}
	public void setResuching(String Resuching) {this.Resuching = Resuching;}
	
	public String toString() {return "연구자 유저, 고유넘버 = "+PN+", 이름 = "+Name+", 나이 ="+age+", 주소 ="+Adress+", 휴대폰 번호 ="+PonNum+", 학교 이름 = "+ScohoolName+", 연구실 이름 = "+Resuching+"]\n";}
}
