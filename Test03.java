package 基础字符流;

import java.io.*;

public class _01_字符输出 {

	public static void main(String[] args) throws IOException{
		
		//路径
		String dir = "E:/aaa/";
		//文件名
		String filename = "222.txt";
		
		
		//保证路径
		File fdir = new File(dir);
		if(!fdir.isDirectory()) {
			fdir.mkdirs();
		}
		
		//保证文件
		File ffile = new File(dir+filename);
		if(!ffile.exists()) {
			ffile.createNewFile();
		}
		
		//创建流对象
		FileWriter fw = new FileWriter(ffile);
		
		//定义内容，写文件
		String str = "今天天气不好，下雨了！☺,★";
		
		//一次性
		fw.write(str);
		
		
		//【关闭流对象】
		fw.close();

		
		

	}

}
