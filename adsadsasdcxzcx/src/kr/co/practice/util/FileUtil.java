package kr.co.practice.util;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

 
public class FileUtil {
 
    public static List<PersonInfo> readFile(File file) throws IOException {
        FileReader filereader = null;
        List<PersonInfo> InfoList = new ArrayList<PersonInfo>();
 
        try {
            filereader = new FileReader(file);
            //���Ͽ��� �о�� ������ List�� �����Ѵ�.
            InfoList = readReader(filereader);
        } finally {
            if (filereader != null)
                filereader.close();
        }
        return InfoList;
    }
    
    public static List<PersonInfo> readReader(Reader input) throws IOException {
        try {
            //������ ������ �о���� BufferReader ��ü ����
            BufferedReader in = new BufferedReader(input);
            String line;
            
            List<PersonInfo> InfoList = new ArrayList<PersonInfo>();
 
            //������ ���پ� �о��. 
            while((line=in.readLine()) != null) {
                // ","�� split�Ͽ� �迭�� ����
                String[] writeStr = line.split(",");
                
                // ��� ������ ����Ǿ� ���� �ʴٸ� skip�Ѵ�.
                if(writeStr.length != 6) continue;
                
                PersonInfo personInfo = new PersonInfo();
                
                //�� ���������� �����Ѵ�.
                personInfo.setPN(Integer.parseInt(writeStr[0]));
                personInfo.setName(writeStr[1]);
                personInfo.setAge(Integer.parseInt(writeStr[2]));
                personInfo.setSex(writeStr[3]);
                personInfo.setNumber(writeStr[4]);
                personInfo.setPhonenumber(writeStr[5]);
                
                //����Ʈ�� ��ü �߰�.
                InfoList.add(personInfo);
            }
            
            return InfoList;
        } finally {
            input.close();
        }
    }
    public static void writeFile(String dir, String name, List<PersonInfo> InfoList ) throws IOException {
        OutputStream out = null;
        try {
            File dirent = new File(dir);
            
            //������ ���丮�� �������� ������ ����
            if(!dirent.exists()) {
                dirent.mkdir();
            }
 
            File outFile = new File(dir, name);
 
            //������ �����Ѵٸ� �����Ѵ�.
            if(outFile.exists()) {
                outFile.delete();
            }
 
            //���Ͽ� String���� �Է��� BufferedOutputStream ����
            out = new BufferedOutputStream(new FileOutputStream(outFile));
            for(int idx=0; idx < InfoList.size(); idx++) {
                //List���� ���������� �����´�.
                String writeStr = InfoList.get(idx).getPN() + "," + InfoList.get(idx).getName() + "," + InfoList.get(idx).getAge() + ","
                                + InfoList.get(idx).getSex() + ","+ InfoList.get(idx).getNumber() + "," + InfoList.get(idx).getPhonenumber()+"\n";
 
                //������ string���� Byte �迭�� ����
                byte[] b = writeStr.getBytes();
                
                //���Ͽ� �ش� ������ ����.
                out.write(b);
            }
        } catch (IOException ioe) {
            //����¿��� ���ܹ߻��� ���� ���� ���
            ioe.printStackTrace();
            throw ioe;
        } finally {
            try {
                //BufferdOutputStream ��ü�� close���ش�.
                if (out != null) out.close();
            } catch (Exception e) {
            }
        }
    } 
    
    
}