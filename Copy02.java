
import java.io.*;

public class Copy02 {

	public static void main(String[] args) throws IOException{
		
		//复制功能： 源文件 ---->读取（文件名 + 内容）----> 内存  ----> 写入新的位置		
		//高层字符操作
		
		
		
		//[原始目标]
		File f = new File("E:/KF27-2随机点名.html");
		
		//[读如内存]
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		//[写入目标]
		FileWriter fw = new FileWriter(new File("C:/KF27-2随机点名.html"));
		BufferedWriter bfw = new BufferedWriter(fw);
		
		//读取保存
		String str="";
		while(true) {
			String x = bfr.readLine();
			if(x==null) {
				break;
			}
			str += x;
		}
		//写入
		bfw.write(str);
		
		
		//关闭
		bfr.close();
		fr.close();		
		bfw.close();
		fw.close();
		
		//删除原始文件【加入就是：剪切】
		//f.delete();
	}

}
