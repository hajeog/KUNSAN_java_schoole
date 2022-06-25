package KoreansPerson;
import java.util.*;

public class PersonUtill {
	List<Person> InfoList = new ArrayList<Person>();
	
	public List<Person> getInfoList(){return this.InfoList;}
	public void setInfoList(List<Person> InfoList) {this.InfoList = InfoList;}
	
	public void addInfo(Person PersonInfo) {
		try {
			this.InfoList.add(PersonInfo);
		}catch(Exception e) {
			System.out.print("정보 저장중 오류가 발생 했습니다!");			
		}
	}
	
	public void removeInfo(String citizenNumber) {
		try {
			for(int i=0;i<this.InfoList.size();i++) {
				Person temp = this.InfoList.get(i);
				
				if(citizenNumber.equals(temp.getcitizenNumber())) {
					this.InfoList.remove(i);
					break;
				}				
			}
		}catch(Exception e) {
			System.out.print("정보 삭제중 에러 발생");
		}
	}
	
	public void updateInfo(Person PersonInfo,String citizenNumber) {
		try {
			for(int i=0 ; i<this.InfoList.size() ; i++) {
				Person temp = this.InfoList.get(i);
				if(citizenNumber.equals(temp.getcitizenNumber())) {
					this.InfoList.remove(i);
					this.InfoList.add(i,PersonInfo);
					break;
				}
			}
		}catch(Exception e) {
			System.out.print("정보 업데이트중 오류 발생");
		}
	}
		
	public void showInfoPerson(int cois) {
		switch(cois) {
		case 1:
			for(Person p : InfoList) {
				toStr(p);
			}
			break;
		case 2: // 생일
			Collections.sort(InfoList,(p1,p2)->p1.getbirthYear()- p2.getbirthYear());
			for(Person p : InfoList) {
				toStr(p);
			}
			break;
		case 3: // 이름
			Collections.sort(InfoList,(p1, p2) ->p1.getname().compareTo(p2.getname()));
			for(Person p : InfoList) {
				toStr(p);
			}			
			break;
		case 4:
			@SuppressWarnings("unused")
			class ComparePerson implements Comparator<Person>{
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getname().compareTo(p2.getname());
				}
			}
			Collections.sort(InfoList,new ComparePerson());
			for(Person p : InfoList) {
				toStr(p);
			}
		}
	}

	public void toStr(Person p) {
		if(p instanceof Researcher) {
			System.out.print(((Researcher)p).toString());
		}else if(p instanceof Student) {
			System.out.print(((Student)p).toString());
		}else if(p instanceof Person) {
			System.out.print(((Person)p).toString());
		}
		System.out.print("");
	}
	
	public void hoReYou(String coisnum) {
		for(int i=0;i<InfoList.size();i++) {
			Person temp = InfoList.get(i);
			
		}
	}
}
