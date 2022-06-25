package KoreansPerson;
import java.util.*;

public class UnivManagementArray {
	Scanner sc = null;
	public UnivManagementArray(){sc = new Scanner(System.in);}
	
	public void PrintMenu() {
		System.out.println("\n======================");
		System.out.println("0) 나가기");
		System.out.println("1) 대학 구성원 Data 입력");
		System.out.println("2) 대학 구성원 Data 출력");
		System.out.println("3) 대학 구성원 Data 변경");
		System.out.println("4) 대학 구성원 Data 삭제");
		System.out.println("5) 대학 구성원 Data 조건 검색");
		System.out.println("======================");
	}
	
	public void printAddMenu() {
		System.out.println("\n======================");
		System.out.println("0) 메인 메뉴로 나가기");
		System.out.println("1) 일반인 입력");
		System.out.println("2) 학생 입력");
		System.out.println("3) 교수 입력");
		System.out.println("======================");		
	}
	
	public void HowtoShoInfo() {
		System.out.println("\n======================");
		System.out.println("0) 메인 메뉴로 나가기");
		System.out.println("1) 전체 보기");
		System.out.println("2) 생일 순으로 보기");
		System.out.println("3) 이름 순으로 보기");
		System.out.println("4) 이름 역순으로 보기");
		System.out.println("======================");		
	}
	public static Researcher makeInfoResearcher() {
		Scanner sc = new Scanner(System.in);
		Researcher Info = new Researcher();
		System.out.print("주민 등록번호 >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("이름 >> ");
		Info.setname(sc.next());
		System.out.print("생년 >> ");
		Info.setbirthYear(sc.nextInt());
		System.out.print("연구실 이름 >> ");
		Info.setemployeeNumber(sc.next());
		System.out.print("전공 >>");
		Info.setdept(sc.next());
		return Info;
	}
	public static Student makeInfoStudent() {
		Scanner sc = new Scanner(System.in);
		Student Info = new Student();
		System.out.print("주민 등록번호 >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("이름 >>");
		Info.setname(sc.next());
		System.out.print("생년 >>");
		Info.setbirthYear(sc.nextInt());
		System.out.print("학번 >>");
		Info.setstudentNumber(sc.next());
		System.out.print("학과 >>");
		Info.setdept(sc.next());
		return Info;
	}
	
	public static Person makeInfoPerson() {
		Scanner sc = new Scanner(System.in);
		Person Info = new Person();
		System.out.print("주민 등록번호 >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("이름 >> ");
		Info.setcitizenNumber(sc.next());
		System.out.print("생년(int) >>");
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
				System.out.print("메인 메뉴로 나갑니다.");				
				break;
			case 1:
				System.out.print("일반인을 입력 시작합니다 \n");
				Info.addInfo(makeInfoPerson());
				break;
			case 2:
				System.out.print("학생을 입력 시작 합니다 \n");
				Info.addInfo(makeInfoStudent());
				break;
			case 3:
				System.out.print("연구자를 입력 시작 합니다 \n");
				Info.addInfo(makeInfoResearcher());
				break;
			default:	
				System.out.print("없는 수 입니다.");
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
			case 0: // 메인나가기'
				System.out.print("메인 메뉴로 나갑니다.\n");				
				break;
			case 1: // 모두 출력
				System.out.print("모두 출력 합니다\n");
				Info.showInfoPerson(cois);
				break;
			case 2: // 생일순
				System.out.print("생일 순으로 출력 합니다.\n");
				Info.showInfoPerson(cois);
				break;
			case 3: // 이름 순
				System.out.print("이름 순으로 출력 합니다.\n");
				Info.showInfoPerson(cois);
				break;
			case 4:
				System.out.print("이름 역순으로 출력 합니다.\n");
				Info.showInfoPerson(cois);
				break;
			}
		}
	}
	
	public void updateInfoList(PersonUtill Info) {
		System.out.print("변경할 인원의 주민 등록 번호를 입력 하시오 >>");
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
				System.out.print("시스템을 종료 합니다.");
				break;
			case 1: // 구성원 입력
				AddPerson(Info);
				break;
			case 2: // 구성원 출력
				printAll(Info);
				break;
			case 3: // 구성원 정보 업데이트
				updateInfoList(Info);
				break;
			case 4: // 구성원 삭제
				System.out.print("삭제할 사람의 주민 등록 번호 >>");
				String remves = sc.next();
				Info.removeInfo(remves);
				break;
			case 5: // 구성원 조건 검색
				
				break;
			default:
				System.out.print("해당 되는 값이 없습니다.");
				break;
					
			}
		}
	}
	
	public static void main(String args[]) {
		UnivManagementArray s  = new UnivManagementArray();
		s.Menu();
	}
}
