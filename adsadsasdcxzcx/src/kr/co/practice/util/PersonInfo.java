package kr.co.practice.util;

public class PersonInfo {
    //������ȣ
    private int PN;
    //�̸�
    private String name;
    
    //����
    private int age;
    
    //����
    private String sex;
    
    //����ȭ
    private String number;
    
    //�޴�����ȣ
    private String phonenumber;
 
    /*
     * �� ��� ���� �� SET/GET Method
     */
    public int getPN() {
        return PN;
    }
 
    public void setPN(int pn) {
        this.PN = pn;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getSex() {
        return sex;
    }
 
    public void setSex(String sex) {
        this.sex = sex;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
 
    public String getPhonenumber() {
        return phonenumber;
    }
 
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public void showInfo() {
        System.out.println("�̸� : " + this.name);
        System.out.println("���� : " + this.age);
        System.out.println("���� : " + this.sex);
        System.out.println("��ȭ��ȣ : " + this.number);
        System.out.println("�޴�����ȣ : " + this.phonenumber);
    }
}
