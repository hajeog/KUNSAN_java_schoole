package Testgo;
public class noberone {
	int id,inschool,berthday;
	String naem,audress;
	public noberone(int id, String naem,String audress, int inschool, int berthday) {
		this.id = id;
		this.naem = naem;
		this.audress = audress;
		this.inschool = inschool;
		this.berthday = berthday;		
	}
	int GetId() {return id;};
	String GetName() {return naem;};
	String GetAudress() {return audress;};
	int GetInschool(){return inschool;};
	int GetBerthday() {return berthday;};
}
