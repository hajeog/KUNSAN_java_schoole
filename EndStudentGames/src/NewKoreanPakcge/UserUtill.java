package NewKoreanPakcge;
import java.util.*;
import java.io.*;
public class UserUtill {
	Scanner sc = null;
	public UserUtill() {sc = new Scanner(System.in);}
	
	public void PrintMenu() {
		System.out.println("");
		System.out.println("0) ������");
		System.out.println("1) ���� ������ Data �Է�");
		System.out.println("2) ���� ������ Data ���");
		System.out.println("3) ���� ������ Data ����");
		System.out.println("4) ���� ������ Data ����");
		System.out.println("");
	}
	
	public void printAddMenu() {
		System.out.println("");
		System.out.println("0) ���� �޴��� ������");
		System.out.println("1) �Ϲ��� �Է�");
		System.out.println("2) �л� �Է�");
		System.out.println("3) ���� �Է�");
		System.out.println("");
	}
	
	public void HowtoShoInfo() {
		System.out.println("");
		System.out.println("0) ���� �޴��� ������");
		System.out.println("1) ��ü ����");
		System.out.println("2) �̸� ������ ����");
		System.out.println("3) �̸� �������� ����");		
		System.out.println("4) ���� ������ ����");
		System.out.println("5) ���� �������� ����");
		System.out.println("");
	}
	
	
	public static User makeInfoUser() {
		Scanner sc = new Scanner(System.in);
		User Info = new User();
		System.out.print("�̸� >>");
		Info.setName(sc.next());
		System.out.print("���� >>");
		Info.setage(sc.nextInt());
		System.out.print("�ּ� >>");
		Info.setAdress(sc.next());
		System.out.print("��ȭ ��ȣ >>");
		Info.setPonNum(sc.next());		
		return Info;		
	}
	
	public static Student makeStudent() {
		Scanner sc = new Scanner(System.in);
		Student Info = new Student();
		System.out.print("�̸� >>");
		Info.setName(sc.next());
		System.out.print("���� >>");
		Info.setage(sc.nextInt());
		System.out.print("�ּ� >>");
		Info.setAdress(sc.next());
		System.out.print("��ȭ ��ȣ >>");
		Info.setPonNum(sc.next());
		System.out.print("�б� �̸� >>");
		Info.setSchoolName(sc.next());
		System.out.print("�й� >>");
		Info.setSchoolnum(sc.next());
		return Info;
	}
	
	public static Researcher makeInfoResearcher() {
		Scanner sc = new Scanner(System.in);
		Researcher Info = new Researcher();
		System.out.print("�̸� >>");
		Info.setName(sc.next());
		System.out.print("�ּ� >>");
		Info.setAdress(sc.next());
		System.out.print("���� >>");
		Info.setage(sc.nextInt());
		System.out.print("��ȭ��ȣ >>");
		Info.setPonNum(sc.next());
		System.out.print("�б� �̸� >>");
		Info.setScohoolName(sc.next());
		System.out.print("������ �̸� >>");
		Info.setResuching(sc.next());
		return Info;
	}
	
	//1�� �޴� �߰�
	public void AddPerson(UserUtle Info,UserFile files,String filepathUser,String filenameUser,String filenameStudent,String filenameResearcher) throws IOException {
		int cois = -1;
		while(cois !=0) {
			printAddMenu();
			cois = sc.nextInt();
			switch(cois) {
			case 0: //���� �޴��� ������
				System.out.print("���� �޴��� �����ϴ�.\n");				
				break;
			case 1: //�Ϲ��� �Է�
				System.out.print("�Ϲ��� �Է��� �����մϴ�.\n");
				Info.addInfo(makeInfoUser());
				files.writeFileUser(filepathUser, filenameUser, Info.getInfoList());
				break;
			case 2: //�л� �Է�
				System.out.print("�л� �Է��� �����մϴ�.\n");
				Info.addInfo(makeStudent());
				files.witeFileStudent(filepathUser, filenameStudent, Info.getInfoListStudent());
				break;
			case 3: // ������ �Է�
				System.out.print("������ �Է��� �����մϴ�.\n");
				Info.addInfo(makeInfoResearcher());
				files.writeFileResearcher(filepathUser, filenameResearcher, Info.getInfoResearcher());
				break;
			}
		}
	}
	
	public void printAll(UserUtle Info) {
		int cois = -1;
		while(cois !=0) {
			HowtoShoInfo();
			cois = sc.nextInt();
			switch(cois) {
			case 0: //���� �޴��� ������
				System.out.print("���� �޴��� �����ϴ�.");
				break;
			case 1: //��ü ����
				Info.showInfoUser(cois);
				break;
			case 2: //�̸� ������ ����
				Info.showInfoUser(cois);
				break;
			case 3: //�̸� �������� ����
				Info.showInfoUser(cois);
				break;
			case 4: //���� ������ ����
				Info.showInfoUser(cois);
				break;
			case 5:
				Info.showInfoUser(cois);
				break;
			}
		}
	}
	
	public void updateInfos(UserUtle Info,int PN) {
		int coisNum = -1;
		coisNum = Info.serchInfos(PN);
		switch(coisNum) {
		case -1:
			System.out.print("�ش��ϴ� �ο��� �����ϴ�.");
		case 1:
			Info.updateInfo(makeInfoResearcher(), PN);
			break;
		case 2:
			Info.updateInfo(makeStudent(), PN);
			break;
		case 3:
			Info.updateInfo(makeInfoUser(), PN);
			break;
		}
	}
	
	@SuppressWarnings("static-access")
	public void Menu() throws IOException {
		int cois = -1;
		String filepathUser = "c:\\test\\";
		String filenameUser = "User.txt";		
		String filenameStudent = "Student.txt";
		String filenameResearcher = "Researcher.txt";
		UserUtle Info = new UserUtle();
		UserFile files = new UserFile();
		Info.setInfoList(files.readFileUser(new File(filepathUser,filenameUser)));
		Info.setInfoListStudent(files.readFileStudent(new File(filepathUser,filenameStudent)));
		Info.setInfoListResearcher(files.readFileResearcher(new File(filepathUser,filenameResearcher)));
		while(cois !=0) {
			PrintMenu();
			cois = sc.nextInt();
			switch(cois) {
			case 0:
				System.out.print("�ý����� ���� �մϴ�.");
				break;
			case 1: // �Է�
				AddPerson(Info,files,filepathUser,filenameUser,filenameStudent,filenameResearcher);
				break;
			case 2: // ���
				printAll(Info);
				break;
			case 3: // ����
				updateInfos(Info,sc.nextInt());
				break;
			case 4: // ����
				System.out.print("������ �ο��� PN >>");				
				Info.removeInfo(sc.nextInt());
				break;
			default:
				System.out.print("�ش� ���� �����ϴ�. ���� �ٽ� Ȯ���� �ּ���.");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		UserUtill go = new UserUtill();
		go.Menu();
	}
}
