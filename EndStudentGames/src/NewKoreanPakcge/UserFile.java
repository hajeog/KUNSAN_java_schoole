package NewKoreanPakcge;
import java.io.*;
import java.util.*;

public class UserFile {
	@SuppressWarnings("resource")
	public static void writeFileUser(String dir,String name,List<User>InfoList) throws IOException {
		OutputStream out = null;
		try {
			File dirent = new File(dir);
			if(!dirent.exists()) {dirent.mkdir();}
			
			File outFile = new File(dir,name);
			if(outFile.exists()) {outFile.delete();}
			
			out = new BufferedOutputStream(new FileOutputStream(outFile));
			
			for(int i=0 ; i<InfoList.size();i++) {
				String writeStr = InfoList.get(i).getPN()+","+InfoList.get(i).getName()+","+InfoList.get(i).getPonNum()+"\n";
				
				byte []b = writeStr.getBytes();
				
				out.write(b);
			}					
		}finally {
			if(out!=null)out.close();
		}
	}
	
	@SuppressWarnings("resource")
	public static void witeFileStudent(String dir,String name,List<Student>InfoList) throws IOException {
		OutputStream out = null;
		try {
			File dirent = new File(dir);
			if(!dirent.exists()) {dirent.mkdir();}
			
			File outFile = new File(dir,name);
			if(outFile.exists()) {outFile.delete();}
			
			out = new BufferedOutputStream(new FileOutputStream(outFile));
			
			for(int i=0 ; i<InfoList.size();i++) {
				String writeStr = InfoList.get(i).getPN()+","+InfoList.get(i).getName()+","+InfoList.get(i).getPonNum()+","+InfoList.get(i).getSchoolName()+","+InfoList.get(i).getSchoolnum()+"\n";
				byte []b = writeStr.getBytes();
				
				out.write(b);
			}					
		}finally {
			if(out!=null)out.close();
		}
	}
	
	public static void writeFileResearcher(String dir,String name,List<Researcher>InfoList) throws IOException {
		OutputStream out = null;
		try {
			File dirent = new File(dir);
			if(!dirent.exists()) {dirent.mkdir();}
			
			File outFile = new File(dir,name);
			if(outFile.exists()) {outFile.delete();}
			
			out = new BufferedOutputStream(new FileOutputStream(outFile));
			
			for(int i=0 ; i<InfoList.size();i++) {
				String writeStr = InfoList.get(i).getPN()+","+InfoList.get(i).getName()+","+InfoList.get(i).getPonNum()+","+InfoList.get(i).getScohoolName()+","+InfoList.get(i).getResuching()+"\n";
				byte []b = writeStr.getBytes();				
				out.write(b);
			}					
		}finally {
			if(out!=null)out.close();
		}
	}
	
	
	
	// ===============
	public static List<User> readFileUser(Reader input) throws IOException{
		try {
			BufferedReader in = new BufferedReader(input);
			String line = null;
			
			List<User> InfoList = new ArrayList<User>();
			
			while((line = in.readLine())!=null) {
				String []writeStr = line.split(",");
				
				if(writeStr.length !=4)continue;
				
				User UserInfo = new User();
				
				UserInfo.setPN(Integer.parseInt(writeStr[0]));
				UserInfo.setName(writeStr[1]);
				UserInfo.setAdress(writeStr[2]);
				UserInfo.setPonNum(writeStr[3]);
				
				InfoList.add(UserInfo);
			}
			return InfoList;
		}finally {
			input.close();
		}		
	}

	public static List<Student> readFileStudent(Reader input) throws IOException{
		try {
			BufferedReader in = new BufferedReader(input);
			String line = null;
			
			List<Student> InfoList = new ArrayList<Student>();
			
			while((line = in.readLine())!=null) {
				String []writeStr = line.split(",");
				
				if(writeStr.length !=6)continue;
				
				Student UserInfo = new Student();
				
				UserInfo.setPN(Integer.parseInt(writeStr[0]));
				UserInfo.setName(writeStr[1]);
				UserInfo.setAdress(writeStr[2]);
				UserInfo.setPonNum(writeStr[3]);
				UserInfo.setSchoolName(writeStr[4]);
				UserInfo.setSchoolnum(writeStr[5]);
				
				InfoList.add(UserInfo);
			}
			return InfoList;
		}finally {
			input.close();
		}		
	}
	
	
	public static List<Researcher> readFileResearcher(Reader input) throws IOException{
		try {
			BufferedReader in = new BufferedReader(input);
			String line = null;
			
			List<Researcher> InfoList = new ArrayList<Researcher>();
			
			while((line = in.readLine())!=null) {
				String []writeStr = line.split(",");
				
				if(writeStr.length !=6)continue;
				
				Researcher UserInfo = new Researcher();
				
				UserInfo.setPN(Integer.parseInt(writeStr[0]));
				UserInfo.setName(writeStr[1]);
				UserInfo.setAdress(writeStr[2]);
				UserInfo.setPonNum(writeStr[3]);
				UserInfo.setScohoolName(writeStr[4]);
				UserInfo.setResuching(writeStr[5]);
				
				InfoList.add(UserInfo);
			}
			return InfoList;
		}finally {
			input.close();
		}		
	}
	
	// ====================
	
	@SuppressWarnings("resource")
	public static List<User> readFileUser(File file) throws IOException{
		FileReader filereader = null;
		List<User> InfoList = new ArrayList<User>();
		
		try {
			filereader = new FileReader(file);
			InfoList = readFileUser(filereader);
		}finally {
			if(filereader !=null) {filereader.close();}
		}
		return InfoList;
	}
	
	public static List<Student> readFileStudent(File file) throws IOException{
		FileReader filereader = null;
		List<Student> InfoList = new ArrayList<Student>();
		
		try {
			filereader = new FileReader(file);
			InfoList = readFileStudent(filereader);
		}finally {
			if(filereader !=null) {filereader.close();}
		}
		return InfoList;
	}
	
	public static List<Researcher> readFileResearcher(File file) throws IOException{
		FileReader filereader = null;
		List<Researcher> InfoList = new ArrayList<Researcher>();
		
		try {
			filereader = new FileReader(file);
			InfoList = readFileResearcher(filereader);
		}finally {
			if(filereader !=null) {filereader.close();}
		}
		return InfoList;
	}
	
	
	// ================================
	
	
}
