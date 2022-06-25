package NewKoreanPakcge;
import java.util.*;

public class UserUtle {
	List<User> InfoList = new ArrayList<User>();
	List<Student>Infotudent = new ArrayList<Student>();
	List<Researcher>InfoResearcher = new ArrayList<Researcher>();
	private int PN = 0;
	
	public List<User>getInfoList(){return this.InfoList;}
	public void setInfoList(List<User>InfoList) {this.InfoList = InfoList;}
	
	public List<Student>getInfoListStudent(){return this.Infotudent;}
	public void setInfoListStudent(List<Student>Infotudent) {this.Infotudent = Infotudent;}
	
	public List<Researcher>getInfoResearcher(){return this.InfoResearcher;}
	public void setInfoListResearcher(List<Researcher>InfoResearcher) {this.InfoResearcher = InfoResearcher;}
	
	public void addInfo(User UserInfo) {
		try {
			UserInfo.setPN(++this.PN);
			this.InfoList.add(UserInfo);
		}catch(Exception e) {
			System.out.print("���� �߰��� ���� �߻�");
		}
	}
	
	public void removeInfo(int PN) {
		try {
			for(int i=0;i<this.InfoList.size();i++) {
				User temp = this.InfoList.get(i);
				if(PN == temp.getPN()) {
					this.InfoList.remove(i);
					break;
				}
				
				if(PN==this.InfoList.size()-1) {
					System.out.print("�ش��ϴ� ���� �ѹ��� �ο��� �����ϴ�.");
				}
			}
		}catch(Exception e) {
			System.out.print("���� ������ ���� �߻�.");
		}
	}
	
	public void updateInfo(User UserInfo,int PN) {
		try {
			for(int i=0 ; i<this.InfoList.size() ; i++) {
				if(PN == this.InfoList.get(i).getPN()) {
					this.InfoList.remove(i);
					this.InfoList.add(i,UserInfo);
					break;
				}
			}
		}catch(Exception e) {
			System.out.print("������Ʈ�� ������ �߻�");
		}
	}
	
	public void showInfoUser(int cois) {
		switch(cois) {
		
		case 1: // ���� ���
			for(User p : InfoList) {
				toStr(p);
			}
			break;
		
		case 2: // �̸� ������ ����
			Collections.sort(InfoList,(p1,p2)->p1.getName().compareTo(p2.getPonNum()));
			for(User p : InfoList) {
				toStr(p);
			}
			break;
		
		case 3: // �̸� �������� ����
			class ComparePerson implements Comparator<User>{
				@Override
				public int compare(User p1, User p2) {
					return p1.getName().compareTo(p2.getPonNum());
					// TODO Auto-generated method stub
				}				
			}
			Collections.sort(InfoList,new ComparePerson());
			for(User p : InfoList) {
				toStr(p);
			}
			break;
			
		case 4: // ���̼�
			Collections.sort(InfoList,(p1,p2)-> p1.getage()-p2.getage());
			for(User p : InfoList) {
				toStr(p);
			}
			break;
		case 5: // ���� ����
			@SuppressWarnings("unused")
			class ComparePerson implements Comparator<User>{
				@Override
				public int compare(User o1, User o2) {
					// TODO Auto-generated method stub					
					return o2.getage()-o1.getage();
				}								
			}
			for(User p : InfoList) {
				toStr(p);
			}
			break;
		}
	}
	
	public void toStr(User p) {
		if(p instanceof Researcher) {
			System.out.print(((Researcher)p).toString());
		}else if(p instanceof Student) {
			System.out.print(((Student)p).toString());
		}else if(p instanceof User) {
			System.out.print(((User)p).toString());
		}
		System.out.print("");
	}
	
	public int serchInfos(int PN) {
		int ret = -1;
		for(User p : InfoList) {
			if(p.getPN() == PN) {
				if(p instanceof Researcher) {
					ret = 1;
				}else if(p instanceof Student) {
					ret =2;
				}else if(p instanceof User) {
					ret =3;
				}
			}
		}
		return ret;
	}
		
}