package kr.co.practice.util;

import java.util.ArrayList;
import java.util.List;
 
public class PersonManager {
    //�������� ������ List
    private List<PersonInfo> InfoList = new ArrayList<PersonInfo>(); 
    //���κ� ������ȣ 
    private int PN = 0;
 
    public List<PersonInfo> getInfoList(){
        return this.InfoList;
    }
    
    public void setInfoList(List<PersonInfo> InfoList) {
        this.InfoList = InfoList;
    }
 
    public int addInfo(PersonInfo personInfo) {
        //�������� return ����
        int ret = 0;
		System.out.print("���� ����");

        try {
            //������ȣ ����
            personInfo.setPN(++this.PN);
			System.out.print("���� ����");

            //List�� ��ü�� �߰� �� �ش�.
            this.InfoList.add(personInfo);
            
        }catch(Exception e) {
            System.out.println("���� �߰� �� ������ �߻��Ͽ����ϴ�." + "\n" + e.getMessage());
            //return�� ����(0 : ����, 1 : ����) 
            ret = 1;
        }
        
        return ret;
    }

    public int removeInfo(int PN) {
        //�������� return ����
        int ret = 0;
        
        try {
            //List������ŭ for��
            for(int idx=0; idx < this.InfoList.size(); idx++) {
                PersonInfo tempPersonInfo = this.InfoList.get(idx);
 
                if(PN == tempPersonInfo.getPN()) {
                    //������ȣ�� ���Ͽ� ���� ��ȣ�� ������ �����Ѵ�.
                    this.InfoList.remove(idx);
                    break;
                }
                
                if(idx == this.InfoList.size()-1) {
                    ret = 2;
                }
            }
        }catch(Exception e) {
            System.out.println("���� ���� �� ������ �߻��Ͽ����ϴ�." + "\n" + e.getMessage());
            //return�� ����(0 : ����, 1 : ����, 2 : �ش���������) 
            ret = 1;
        }
        
        return ret;
    }
    
    public int updateInfo(PersonInfo personInfo, int PN) {
        //�������� return ����
        int ret = 0;        
        try {
            //List������ŭ for��
            for(int idx=0; idx < this.InfoList.size(); idx++) {
                PersonInfo tempPersonInfo = this.InfoList.get(idx);
                if(PN == tempPersonInfo.getPN()) {
                    personInfo.setPN(PN);
                    //������ȣ�� ���Ͽ� ���� ��ȣ�� ������ �����Ѵ�.
                    this.InfoList.remove(idx);
                    this.InfoList.add(idx, personInfo);
                    break;
                }
                
                if(idx == this.InfoList.size()-1) {
                    ret = 2;
                }
            }
        }catch(Exception e) {
            System.out.println("���� ���� �� ������ �߻��Ͽ����ϴ�." + "\n" + e.getMessage());
            //return�� ����(0 : ����, 1 : ����, 2 : �ش���������) 
            ret = 1;
        }        
        return ret;
    }   
    
    public void showInfo() {
        for(int idx=0; idx < this.InfoList.size(); idx++) {
            System.out.println("##########################");
            System.out.println("������ȣ : " + this.InfoList.get(idx).getPN()
                                +"\n�̸� : " + this.InfoList.get(idx).getName()
                                +"\n���� : " + this.InfoList.get(idx).getAge()
                                +"\n���� : " + this.InfoList.get(idx).getSex()
                                +"\n��ȭ��ȣ : " + this.InfoList.get(idx).getNumber()
                                +"\n�޴�����ȣ : " + this.InfoList.get(idx).getPhonenumber()
                                );
            System.out.println("##########################");
        }
    }
}