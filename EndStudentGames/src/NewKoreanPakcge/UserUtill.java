package NewKoreanPakcge;
import java.util.*;
import java.io.*;
public class UserUtill {
	Scanner sc = null;
	public UserUtill() {sc = new Scanner(System.in);}
	
	public void PrintMenu() {
		System.out.println("");
		System.out.println("0) 나가기");
		System.out.println("1) 대학 구성원 Data 입력");
		System.out.println("2) 대학 구성원 Data 출력");
		System.out.println("3) 대학 구성원 Data 변경");
		System.out.println("4) 대학 구성원 Data 삭제");
		System.out.println("");
	}
	
	public void printAddMenu() {
		System.out.println("");
		System.out.println("0) 메인 메뉴로 나가기");
		System.out.println("1) 일반인 입력");
		System.out.println("2) 학생 입력");
		System.out.println("3) 교수 입력");
		System.out.println("");
	}
	
	public void HowtoShoInfo() {
		System.out.println("");
		System.out.println("0) 메인 메뉴로 나가기");
		System.out.println("1) 전체 보기");
		System.out.println("2) 이름 순으로 보기");
		System.out.println("3) 이름 역순으로 보기");		
		System.out.println("4) 생일 순으로 보기");
		System.out.println("5) 생일 역순으로 보기");
		System.out.println("");
	}
	
	
	public static User makeInfoUser() {
		Scanner sc = new Scanner(System.in);
		User Info = new User();
		System.out.print("이름 >>");
		Info.setName(sc.next());
		System.out.print("나이 >>");
		Info.setage(sc.nextInt());
		System.out.print("주소 >>");
		Info.setAdress(sc.next());
		System.out.print("전화 번호 >>");
		Info.setPonNum(sc.next());		
		return Info;		
	}
	
	public static Student makeStudent() {
		Scanner sc = new Scanner(System.in);
		Student Info = new Student();
		System.out.print("이름 >>");
		Info.setName(sc.next());
		System.out.print("나이 >>");
		Info.setage(sc.nextInt());
		System.out.print("주소 >>");
		Info.setAdress(sc.next());
		System.out.print("전화 번호 >>");
		Info.setPonNum(sc.next());
		System.out.print("학교 이름 >>");
		Info.setSchoolName(sc.next());
		System.out.print("학번 >>");
		Info.setSchoolnum(sc.next());
		return Info;
	}
	
	public static Researcher makeInfoResearcher() {
		Scanner sc = new Scanner(System.in);
		Researcher Info = new Researcher();
		System.out.print("이름 >>");
		Info.setName(sc.next());
		System.out.print("주소 >>");
		Info.setAdress(sc.next());
		System.out.print("나이 >>");
		Info.setage(sc.nextInt());
		System.out.print("전화번호 >>");
		Info.setPonNum(sc.next());
		System.out.print("학교 이름 >>");
		Info.setScohoolName(sc.next());
		System.out.print("연구실 이름 >>");
		Info.setResuching(sc.next());
		return Info;
	}
	
	//1번 메뉴 추가
	public void AddPerson(UserUtle Info,UserFile files,String filepathUser,String filenameUser,String filenameStudent,String filenameResearcher) throws IOException {
		int cois = -1;
		while(cois !=0) {
			printAddMenu();
			cois = sc.nextInt();
			switch(cois) {
			case 0: //메인 메뉴로 나가기
				System.out.print("메인 메뉴로 나갑니다.\n");				
				break;
			case 1: //일반인 입력
				System.out.print("일반인 입력을 시작합니다.\n");
				Info.addInfo(makeInfoUser());
				files.writeFileUser(filepathUser, filenameUser, Info.getInfoList());
				break;
			case 2: //학생 입력
				System.out.print("학생 입력을 시작합니다.\n");
				Info.addInfo(makeStudent());
				files.witeFileStudent(filepathUser, filenameStudent, Info.getInfoListStudent());
				break;
			case 3: // 연구자 입력
				System.out.print("연구자 입력을 시작합니다.\n");
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
			case 0: //메인 메뉴로 나가기
				System.out.print("메인 메뉴로 나갑니다.");
				break;
			case 1: //전체 보기
				Info.showInfoUser(cois);
				break;
			case 2: //이름 순으로 보기
				Info.showInfoUser(cois);
				break;
			case 3: //이름 역순으로 보기
				Info.showInfoUser(cois);
				break;
			case 4: //생일 순으로 보기
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
			System.out.print("해당하는 인원이 없습니다.");
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
				System.out.print("시스템을 종료 합니다.");
				break;
			case 1: // 입력
				AddPerson(Info,files,filepathUser,filenameUser,filenameStudent,filenameResearcher);
				break;
			case 2: // 출력
				printAll(Info);
				break;
			case 3: // 변경
				updateInfos(Info,sc.nextInt());
				break;
			case 4: // 삭제
				System.out.print("삭제할 인원의 PN >>");				
				Info.removeInfo(sc.nextInt());
				break;
			default:
				System.out.print("해당 값이 없습니다. 값을 다시 확인해 주세요.");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		UserUtill go = new UserUtill();
		go.Menu();
	}
}
