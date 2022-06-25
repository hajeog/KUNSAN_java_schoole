package kr.co.practice.util;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
public class PersonDesk {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //�߰�, ����, ������ ���� ��ü ����
        PersonManager pm = new PersonManager();
        
        //������ ��ġ �� ����
        String filepath = "c:\\test\\";
        String filename = "person.txt";
 
        boolean power = true;
        
        while(power) {
            scan.reset();
            System.out.println("1. ���, 2. �߰�, 3. ����, 4. ����, 5. ��������, 6. ���Ͽ����ҷ�����, 7. ����, 8. ó������");
            
            String menuNum = scan.next();
 
            if("1".equals(menuNum)) {
                pm.showInfo();
            }else if("2".equals(menuNum)) {
                pm.addInfo(makeInfo());
            }else if("3".equals(menuNum)) {
                System.out.println("������ ������ ������ȣ�� �Է��� �ּ���.");
                int PN = scan.nextInt();
                pm.updateInfo(makeInfo(), PN);
            }else if("4".equals(menuNum)) {
                System.out.println("������ ������ ������ȣ�� �Է��� �ּ���.");
                pm.removeInfo(scan.nextInt());
            }else if("5".equals(menuNum)) {
                FileUtil.writeFile(filepath, filename, pm.getInfoList());
            }else if("6".equals(menuNum)) {
                pm.setInfoList(FileUtil.readFile(new File(filepath, filename)));
            }else if("7".equals(menuNum)) {
                power = false;
            }else if("8".equals(menuNum)) {
                continue;
            }else {
                System.out.println("�ش� �޴��� ���� �޴��Դϴ�. �ٽ� ���� �ٶ��ϴ�.");
                continue;    
            }
        }
        scan.close();
    }
    
    public static PersonInfo makeInfo() {
        scan.reset();
        PersonInfo person = new PersonInfo();        
        System.out.print("�̸� : ");
        person.setName(scan.next());     
        System.out.println();
        System.out.print("���� : ");
        person.setAge(scan.nextInt());
        System.out.println();
        System.out.print("����  : ");
        person.setSex(scan.next());
        System.out.println();
        System.out.print("��ȭ��ȣ  : ");
        person.setNumber(scan.next());
        System.out.println();
        System.out.print("�޴�����ȣ  : ");
        person.setPhonenumber(scan.next());        
        System.out.println();            
        return person;
    }
}
