
import java.io.*;

public class Copy01 {

	public static void main(String[] args) throws IOException{
		
		//复制功能： 源文件 ---->读取（文件名 + 内容）----> 内存  ----> 写入新的位置		
		//高层字符操作
		
		String str="";
		
		
		//[读如内存]
		File f = new File("E:/KF27-2随机点名.html");
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		
		
		while(true) {
			String x = bfr.readLine();
			if(x==null) {
				break;
			}
			str += x;
		}
		bfr.close();
		fr.close();
		
		
		
		
		//[写入目标]
		FileWriter fw = new FileWriter(new File("C:/KF27-2随机点名.html"));
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write(str);
		
		bfw.close();
		fw.close();
		

	}

}
