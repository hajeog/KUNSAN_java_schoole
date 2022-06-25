package KoreansPerson;
import java.util.*;

public class UnivManagementArray {
	Scanner sc = null;
	public UnivManagementArray(){sc = new Scanner(System.in);}
	
	public void PrintMenu() {
		System.out.println("\n======================");
		System.out.println("0) ������");
		System.out.println("1) ���� ������ Data �Է�");
		System.out.println("2) ���� ������ Data ���");
		System.out.println("3) ���� ������ Data ����");
		System.out.println("4) ���� ������ Data ����");
		System.out.println("5) ���� ������ Data ���� �˻�");
		System.out.println("======================");
	}
	
	public void printAddMenu() {
		System.out.println("\n======================");
		System.out.println("0) ���� �޴��� ������");
		System.out.println("1) �Ϲ��� �Է�");
		System.out.println("2) �л� �Է�");
		System.out.println("3) ���� �Է�");
		System.out.println("======================");		
	}
	
	public void HowtoShoInfo() {
		System.out.println("\n======================");
		System.out.println("0) ���� �޴��� ������");
		System.out.println("1) ��ü ����");
		System.out.println("2) ���� ������ ����");
		System.out.println("3) �̸� ������ ����");
		System.out.println("4) �̸� �������� ����");
		System.out.println("======================");		
	}
	public static Researcher makeInfoResearcher() {
		Scanner sc = new Scanner(System.in);
		Researcher Info = new Researcher();
		System.out.print("�ֹ� ��Ϲ�ȣ >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("�̸� >> ");
		Info.setname(sc.next());
		System.out.print("���� >> ");
		Info.setbirthYear(sc.nextInt());
		System.out.print("������ �̸� >> ");
		Info.setemployeeNumber(sc.next());
		System.out.print("���� >>");
		Info.setdept(sc.next());
		return Info;
	}
	public static Student makeInfoStudent() {
		Scanner sc = new Scanner(System.in);
		Student Info = new Student();
		System.out.print("�ֹ� ��Ϲ�ȣ >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("�̸� >>");
		Info.setname(sc.next());
		System.out.print("���� >>");
		Info.setbirthYear(sc.nextInt());
		System.out.print("�й� >>");
		Info.setstudentNumber(sc.next());
		System.out.print("�а� >>");
		Info.setdept(sc.next());
		return Info;
	}
	
	public static Person makeInfoPerson() {
		Scanner sc = new Scanner(System.in);
		Person Info = new Person();
		System.out.print("�ֹ� ��Ϲ�ȣ >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("�̸� >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("����(int) >>");
		Info.setbirthYear(sc.nextInt());
		return Info;
	}
	
	public void AddPerson(PersonUtill Info) {
		int cois = -1;
		while(cois != 0) {
			printAddMenu();
			cois = sc.nextInt();
			switch(cois) {
			case 0:
				System.out.print("���� �޴��� �����ϴ�.");				
				break;
			case 1:
				System.out.print("�Ϲ����� �Է� �����մϴ� \n");
				Info.addInfo(makeInfoPerson());
				break;
			case 2:
				System.out.print("�л��� �Է� ���� �մϴ� \n");
				Info.addInfo(makeInfoStudent());
				break;
			case 3:
				System.out.print("�����ڸ� �Է� ���� �մϴ� \n");
				Info.addInfo(makeInfoResearcher());
				break;
			default:	
				System.out.print("���� �� �Դϴ�.");
				break;
			}
		}
	}
	
	public void printAll(PersonUtill Info) {
		PersonUtill capyInfo = Info;
		int cois = -1;
		while(cois !=0) {
			HowtoShoInfo();
			cois = sc.nextInt();
			switch(cois) {
			case 0: // ���γ�����'
				System.out.print("���� �޴��� �����ϴ�.\n");				
				break;
			case 1: // ��� ���
				System.out.print("��� ��� �մϴ�\n");
				Info.showInfoPerson(cois);
				break;
			case 2: // ���ϼ�
				System.out.print("���� ������ ��� �մϴ�.\n");
				Info.showInfoPerson(cois);
				break;
			case 3: // �̸� ��
				System.out.print("�̸� ������ ��� �մϴ�.\n");
				Info.showInfoPerson(cois);
				break;
			case 4:
				System.out.print("�̸� �������� ��� �մϴ�.\n");
				Info.showInfoPerson(cois);
				break;
			}
		}
	}
	
	public void updateInfoList(PersonUtill Info) {
		System.out.print("������ �ο��� �ֹ� ��� ��ȣ�� �Է� �Ͻÿ� >>");
		String coisnum = sc.next();
		
	}
	
	public void Menu() {
		int cois = -1;
		PersonUtill Info = new PersonUtill();
		while(cois !=0) {
			PrintMenu();
			cois = sc.nextInt();
			switch(cois) {
			case 0:
				System.out.print("�ý����� ���� �մϴ�.");
				break;
			case 1: // ������ �Է�
				AddPerson(Info);
				break;
			case 2: // ������ ���
				printAll(Info);
				break;
			case 3: // ������ ���� ������Ʈ
				updateInfoList(Info);
				break;
			case 4: // ������ ����
				System.out.print("������ ����� �ֹ� ��� ��ȣ >>");
				String remves = sc.next();
				Info.removeInfo(remves);
				break;
			case 5: // ������ ���� �˻�
				
				break;
			default:
				System.out.print("�ش� �Ǵ� ���� �����ϴ�.");
				break;
					
			}
		}
	}
	
	public static void main(String args[]) {
		UnivManagementArray s  = new UnivManagementArray();
		s.Menu();
	}
}
