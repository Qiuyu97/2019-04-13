package 高层缓冲读写;

import java.io.*;

public class _01_高层字符输入流 {

	public static void main(String[] args) throws IOException{


		//第一步：创建基础的
		FileReader fr = new FileReader(new File("E:/aaa/222.txt"));
		
		//第二步：创建高层，带入fr
		BufferedReader bfr = new BufferedReader(fr);
		
		
		//bfr.read()：和原来一样，一个个读取
		// 源文件读取一个---->缓冲--->程序中
		
		//bfr.readLine()：有缓存区了，所以，可以一行行读取
		// 源文件读取一行---->缓冲--->程序中
		
		while(true) {
			String str = bfr.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		
		
		
		//【安顺序关闭】
		bfr.close();
		fr.close();
		


	}

}
