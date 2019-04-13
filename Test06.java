package 高层缓冲读写;

import java.io.*;

public class _02_高层字符输出流 {

	public static void main(String[] args) throws IOException{

		
		//【先保证路径，和文件】
		

		//第一步：创建基础的
		FileWriter fw = new FileWriter(new File("E:/aaa/333.txt"));
		
		//第二步：创建高层，带入fr
		BufferedWriter bfw = new BufferedWriter(fw);
		
		
		String str = "这里是新的内容！";
		//写内容		
		bfw.write(str);
		
		
		
		//【关闭】
		bfw.close();
		fw.close();
		

	}

}
